/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi.akses.modifier;

/**
 *
 * @author Lenovo
 */
public class Manusia {
    private String nama;
    protected int usia;
    public String pekerjaan;

    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    // Getter for nama
    public String getNama() {
        return nama;
    }

    // Setter for nama
    public void setNama(String nama) {
        this.nama = nama;
    }
}
