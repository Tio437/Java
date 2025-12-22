/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

/**
 *
 * @author Lenovo
 */
import java.io.*;
import java.util.*;

public class Main {
    private static final String FILE_NAME = "database_perpus.dat";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Perpustakaan perpus = muatData();

        while (true) {
            try {
                System.out.println("\n=== SISTEM PERPUSTAKAAN DIGITAL ===");
                System.out.println("1. Tambah Buku");
                System.out.println("2. Lihat Koleksi");
                System.out.println("3. Pinjam Buku");
                System.out.println("4. Simpan & Keluar");
                System.out.print("Pilih menu: ");
                
                int pilihan = Integer.parseInt(sc.nextLine()); // Menghindari error buffer scanner

                switch (pilihan) {
                    case 1:
                        System.out.print("Judul: "); String jdl = sc.nextLine();
                        System.out.print("ID: "); String id = sc.nextLine();
                        System.out.print("Penulis: "); String pen = sc.nextLine();
                        perpus.tambahBuku(new Buku(jdl, id, pen));
                        break;
                    case 2:
                        System.out.println("\n--- KOLEKSI SAAT INI ---");
                        perpus.getDaftarBuku().forEach(Buku::tampilkanInfo);
                        break;
                    case 3:
                        System.out.print("Masukkan ID Buku yang ingin dipinjam: ");
                        String searchId = sc.nextLine();
                        for (Buku b : perpus.getDaftarBuku()) {
                            if (b.getId().equals(searchId) && !b.isDipinjam()) {
                                b.prosesPinjam("User");
                                System.out.println("Berhasil meminjam!");
                            }
                        }
                        break;
                    case 4:
                        simpanData(perpus);
                        System.out.println("Data tersimpan. Keluar...");
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (Exception e) {
                // 4. Mencegah program berhenti saat salah input
                System.out.println("Terjadi kesalahan input: " + e.getMessage());
            }
        }
    }
    
    private static void simpanData(Perpustakaan p) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                oos.writeObject(p);
            } catch (IOException e) { System.out.println("Gagal menyimpan."); }
        }

        private static Perpustakaan muatData() {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                return (Perpustakaan) ois.readObject();
            } catch (Exception e) {
                return new Perpustakaan();
            }
        }
    }
