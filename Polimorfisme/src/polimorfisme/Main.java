/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(new Buku("Buku Algoritma", 100000));
        keranjang.tambahProduk(new Elektronik("Laptop", 10000000));
        keranjang.tambahProduk(new Pakaian("Kemeja", 200000));

        keranjang.cetakDaftarBelanja();
        System.out.println("--------------------------------------------------");

        double totalSebelumDiskon = keranjang.hitungTotalHargaSebelumDiskon();
        double totalSetelahDiskon = keranjang.hitungTotalHargaSetelahDiskon();

        System.out.printf("Total harga sebelum diskon: Rp%.0f%n", totalSebelumDiskon);
        System.out.printf("Total harga setelah diskon: Rp%.0f%n", totalSetelahDiskon);
    }
}
