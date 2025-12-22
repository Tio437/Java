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
import java.io.Serializable;

interface Transaksi {
    void prosesPinjam(String peminjam);
    void prosesKembali();
}

abstract class Koleksi implements Serializable {
    protected String judul, id;
    public Koleksi(String judul, String id) { this.judul = judul; this.id = id; }
    public abstract void tampilkanInfo();
}

// --- KELAS KONKRET ---
class Buku extends Koleksi implements Transaksi, Serializable {
    private String penulis;
    private boolean dipinjam = false;

    public Buku(String judul, String id, String penulis) {
        super(judul, id);
        this.penulis = penulis;
    }

    @Override
    public void tampilkanInfo() {
        System.out.printf("[%s] %-20s | Penulis: %-15s | Status: %s%n", 
            id, judul, penulis, (dipinjam ? "DIPINJAM" : "TERSEDIA"));
    }

    @Override
    public void prosesPinjam(String peminjam) { dipinjam = true; }
    @Override
    public void prosesKembali() { dipinjam = false; }
    public boolean isDipinjam() { return dipinjam; }
    public String getId() { return id; }
}