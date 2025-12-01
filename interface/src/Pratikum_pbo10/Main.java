/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum_pbo10;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Elektronik
        Elektronik laptop = new Elektronik();
        double hargaLaptop = 5000000; // Contoh harga 5 juta
        double pajakLaptop = laptop.hitungPajak(hargaLaptop);

        // Membuat objek dari kelas Makanan
        Makanan nasiGoreng = new Makanan();
        double hargaMakanan = 25000; // Contoh harga 25 ribu
        double pajakMakanan = nasiGoreng.hitungPajak(hargaMakanan);

        // Menampilkan Hasil
        System.out.println("=== SISTEM PEMBAYARAN TOKO ===");
        System.out.println("------------------------------");
        
        System.out.println("Produk: Elektronik");
        System.out.println("Harga Asli : Rp " + hargaLaptop);
        System.out.println("Pajak (10%): Rp " + pajakLaptop);
        System.out.println("Total Bayar: Rp " + (hargaLaptop + pajakLaptop));
        
        System.out.println("------------------------------");
        
        System.out.println("Produk: Makanan");
        System.out.println("Harga Asli : Rp " + hargaMakanan);
        System.out.println("Pajak (5%) : Rp " + pajakMakanan);
        System.out.println("Total Bayar: Rp " + (hargaMakanan + pajakMakanan));
    }
}
