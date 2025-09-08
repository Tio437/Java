/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * @author Lenovo
 */
public class Hewan {

    String nama;
    int umur;

    void suara() {
        System.out.println("Hewan bersuara");
    }
    
    void info() {
        System.out.println("Nama: " + nama + ", Umur: " + umur);
    }
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    // Dalam class Hewan
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    void berlari() {
        System.out.println("Hewan sedang berlari");
    }
}

