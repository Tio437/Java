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
import java.io.Serializable;

public class Buku implements Serializable {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Method untuk memudahkan konversi ke String saat disimpan ke .txt
    @Override
    public String toString() {
        return "Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun: " + tahunTerbit;
    }
    
    // Method display khusus jika diperlukan
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul + " | Pengarang: " + pengarang + " | Tahun: " + tahunTerbit);
    }
    
}

