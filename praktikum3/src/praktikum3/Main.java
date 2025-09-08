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
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Mimi", 3);
        kucing.suara();
        kucing.info();
        Hewan anjing = new Hewan("Anjing", 5);
        anjing.berlari();
    }
}


