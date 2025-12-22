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
import java.util.*;
import java.io.Serializable;

class Anggota implements Serializable {
    private String nama;
    public Anggota(String nama) { this.nama = nama; }
    public String getNama() { return nama; }
}

class Perpustakaan implements Serializable {
    private List<Buku> daftarBuku = new ArrayList<>();
    private List<Anggota> daftarAnggota = new ArrayList<>();

    public void tambahBuku(Buku b) { daftarBuku.add(b); }
    public void tambahAnggota(Anggota a) { daftarAnggota.add(a); }
    public List<Buku> getDaftarBuku() { return daftarBuku; }
    public List<Anggota> getDaftarAnggota() { return daftarAnggota; }
}
