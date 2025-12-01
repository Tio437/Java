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
import java.util.ArrayList;
import java.util.List;

// 1. Kelas Pengarang
// Hubungan Agregasi: Pengarang bisa berdiri sendiri tanpa buku tertentu.
public class Pengarang {
    private String namaPengarang;

    public Pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public void infoPengarang() {
        System.out.println("Nama Pengarang: " + this.namaPengarang);
    }
}
