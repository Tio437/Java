/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpbo_11;

import java.util.ArrayList;
import java.util.List;


public class Perpustakaan {
    private List<Buku> daftarBuku;

    public Perpustakaan() {
        // Inisialisasi list buku saat objek Perpustakaan dibuat
        this.daftarBuku = new ArrayList<>(); 
    }

    public void tambahBuku(Buku buku) {
        this.daftarBuku.add(buku);
    }

    public void infoPerpustakaan() {
        System.out.println("=== DAFTAR BUKU DI PERPUSTAKAAN ===");
        if (daftarBuku.isEmpty()) {
            System.out.println("Perpustakaan belum memiliki buku.");
        } else {
            for (Buku buku : daftarBuku) {
                buku.infoBuku();
            }
        }
    }
}

