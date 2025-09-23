/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        // Demonstrasi pewarisan Hewan
        System.out.println("--- Informasi Hewan ---");
        Kucing kucingku = new Kucing("Milo");
        Anjing anjingku = new Anjing("Buddy");

        kucingku.tampilkanInfo();
        kucingku.bersuara();

        System.out.println(); // Spasi

        anjingku.tampilkanInfo();
        anjingku.bersuara();

        System.out.println("\n--- Informasi Kendaraan ---");
        // Demonstrasi pewarisan Kendaraan
        Mobil mobilku = new Mobil("Honda");
        Sepeda_Motor motorku = new Sepeda_Motor("Yamaha");

        mobilku.tampilkanInfo();
        mobilku.klakson();

        System.out.println(); // Spasi

        motorku.tampilkanInfo();
        motorku.nyalakanMesin();
    }
}
