/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikumpbo_9;

/**
 *
 * @author Lenovo
 */
abstract class Hewan {
    // Metode abstrak tanpa implementasi
    abstract void suara();
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Kucing mengeluarkan suara: Meong");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Anjing mengeluarkan suara: Guk Guk");
    }
}
