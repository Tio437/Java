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
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> daftarProduk;

    public KeranjangBelanja() {
        this.daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double hitungTotalHargaSebelumDiskon() {
        double total = 0;
        for (Produk produk : daftarProduk) {
            total += produk.getHarga();
        }
        return total;
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : daftarProduk) {
            total += produk.getHarga() - produk.hitungDiskon();
        }
        return total;
    }

    public void cetakDaftarBelanja() {
        System.out.println("Daftar Produk di Keranjang:");
        for (Produk produk : daftarProduk) {
            double hargaAwal = produk.getHarga();
            double diskon = produk.hitungDiskon();
            double hargaAkhir = hargaAwal - diskon;
            System.out.printf("- %s: Rp%.0f (Harga Awal: Rp%.0f, Diskon: Rp%.0f)%n",
                              produk.getNama(), hargaAkhir, hargaAwal, diskon);
        }
    }
}
