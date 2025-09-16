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
public class pekerja extends Manusia {
    private double gaji;

    public pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    // Getter for gaji
    public double getGaji() {
        return gaji;
    }

    // Setter for gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return "Nama: " + getNama() + ", Usia: " + usia + ", Pekerjaan: " + pekerjaan + ", Gaji: " + gaji;
    }
}
