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
public class Hewan {
    String nama;
    String jenis;

    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}

class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama, "Anjing");
    }

    public void bersuara() {
        System.out.println("Guk guk!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Anjing adalah hewan peliharaan yang setia.");
    }
}

class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama, "Kucing");
    }

    public void bersuara() {
        System.out.println("Meong!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kucing adalah hewan peliharaan yang lincah.");
    }
}
