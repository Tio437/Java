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
public class Buku {
    private String judul;
    private Pengarang pengarang; // Agregasi: Buku "memiliki" Pengarang

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + this.judul);
        if (this.pengarang != null) {
            this.pengarang.infoPengarang();
        }
        System.out.println("-------------------------");
    }
}
