/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpbo_11;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        // A. Demonstrasi Agregasi
        // Pengarang dibuat TERPISAH dari Buku. 
        // Jika objek buku dihapus, pengarang ini tetap hidup di memori.
        Pengarang pengarang1 = new Pengarang("Tere Liye");
        Pengarang pengarang2 = new Pengarang("Andrea Hirata");

        // Membuat Buku dengan memasukkan objek Pengarang yang sudah ada
        Buku buku1 = new Buku("Hujan", pengarang1);
        Buku buku2 = new Buku("Bumi", pengarang1); // Satu pengarang bisa punya banyak buku
        Buku buku3 = new Buku("Laskar Pelangi", pengarang2);

        // B. Demonstrasi Komposisi
        // Perpustakaan dibuat, dan buku-buku dimasukkan ke dalamnya.
        Perpustakaan perpusKota = new Perpustakaan();

        perpusKota.tambahBuku(buku1);
        perpusKota.tambahBuku(buku2);
        perpusKota.tambahBuku(buku3);

        // Menampilkan informasi
        perpusKota.infoPerpustakaan();
    }
}
    
