/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_io_dan_serialisasi;

/**
 *
 * @author Lenovo
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemPerpustakaan {
    // Nama file untuk penyimpanan
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    
    // List untuk menampung buku sementara di memori sebelum diserialisasi
    private static List<Buku> daftarBuku = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== SISTEM MANAJEMEN BUKU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku Baru (Simpan ke Text)");
            System.out.println("2. Simpan Objek Buku (Simpan ke Serial)");
            System.out.println("3. Tampilkan Daftar Buku (dari Text & Serial)");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer newline

            switch (pilihan) {
                case 1:
                    tambahBuku(scanner);
                    break;
                case 2:
                    simpanKeSerial();
                    break;
                case 3:
                    tampilkanBuku();
                    break;
                case 4:
                    System.out.println("Terima kasih, program dihentikan.");
                    scanner.close(); // Menutup resource [cite: 250]
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    // 1. Tambah buku dan simpan ke buku.txt (File I/O) [cite: 247]
    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan Judul Buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan Pengarang: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan Tahun Terbit: ");
        int tahun = scanner.nextInt();

        Buku bukuBaru = new Buku(judul, pengarang, tahun);
        daftarBuku.add(bukuBaru); // Tambah ke list memori

        // Menulis ke file teks (Append mode: true)
        try (FileWriter writer = new FileWriter(TEXT_FILE, true)) {
            writer.write(bukuBaru.toString() + "\n");
            System.out.println("Sukses: Buku ditambahkan ke " + TEXT_FILE);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke file teks.");
            e.printStackTrace();
        }
    }

    // 2. Simpan objek list buku ke buku.ser (Serialisasi) [cite: 248]
    private static void simpanKeSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(daftarBuku);
            System.out.println("Sukses: Objek buku diserialisasi ke " + SERIAL_FILE);
        } catch (IOException e) {
            System.out.println("Gagal melakukan serialisasi.");
            e.printStackTrace();
        }
    }

    // 3. Tampilkan buku dari kedua file [cite: 249]
    private static void tampilkanBuku() {
        System.out.println("\n--- [DATA DARI FILE TEKS (buku.txt)] ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File teks belum ada.");
        } catch (IOException e) {
            System.out.println("Gagal membaca file teks.");
        }

        System.out.println("\n--- [DATA DARI FILE SERIAL (buku.ser)] ---");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            List<Buku> bukuList = (List<Buku>) ois.readObject();
            for (Buku b : bukuList) {
                b.tampilkanInfo();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File serial belum ada (lakukan Opsi 2 dulu).");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Gagal membaca file serial.");
        }
    }
}
