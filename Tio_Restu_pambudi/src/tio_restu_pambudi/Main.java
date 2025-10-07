/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tio_restu_pambudi;

/**
 *
 * @author Lenovo
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        // Produk
        System.out.println("1. Produk");
        Produk laptop = new Elektronik("Laptop", 15000000, 2);
        laptop.tampilkanInfo();
        System.out.println();

        // Pegawai
        System.out.println("2. Pegawai");
        Pegawai pegawaiTetap = new PegawaiTetap("Budi", 5000000, 1000000);
        pegawaiTetap.tampilkanInfo();
        System.out.println();

        // Polimorfisme
        System.out.println("3. Polimorfisme");
        // Menggunakan referensi Produk untuk objek Makanan
        Produk produkPolimorfisme = new Makanan("Snack", 15000, "2023-12-30");
        produkPolimorfisme.tampilkanInfo();
        System.out.println();

        // Menggunakan referensi Pegawai untuk objek PegawaiKontrak
        Pegawai pegawaiPolimorfisme = new PegawaiKontrak("Andi", 3000000, 12);
        pegawaiPolimorfisme.tampilkanInfo();
    }
}