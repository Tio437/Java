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
public class Kendaraan {
    String merek;

    public Kendaraan(String merek) {
        this.merek = merek;
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
    }
}

class Kendaraan_Darat extends Kendaraan {
    int jumlahRoda;

    public Kendaraan_Darat(String merek, int jumlahRoda) {
        super(merek);
        this.jumlahRoda = jumlahRoda;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}



class Mobil extends Kendaraan_Darat {
    public Mobil(String merek) {
        super(merek, 4);
    }

    public void klakson() {
        System.out.println("Beep beep!");
    }
}

class Sepeda_Motor extends Kendaraan_Darat {
    public Sepeda_Motor(String merek) {
        super(merek, 2);
    }

    public void nyalakanMesin() {
        System.out.println("Vroom vroom!");
    }
}