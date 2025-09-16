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
public class main {
    public static void main(String[] args) {
        // Create an object of the Pekerja class
        pekerja pekerja = new pekerja("Budi", 30, "Programmer", 5000000.0);

        // Display worker information using toString()
        System.out.println("Informasi Pekerja Awal:");
        System.out.println(pekerja.toString());

        // Change the worker's name using the setter method
        pekerja.setNama("Budi Santoso");

        // Display updated worker information
        System.out.println("\nInformasi Pekerja Setelah Diubah:");
        System.out.println(pekerja.toString());

    }
}
