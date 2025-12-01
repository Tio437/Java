/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum_pbo10;

/**
 *
 * @author Lenovo
 */
interface Pembayaran {
    double hitungPajak(double harga);
}

class Elektronik implements Pembayaran {
    
    @Override
    public double hitungPajak(double harga) {
        // Pajak 10% = 0.10
        return harga * 0.10;
    }
}

class Makanan implements Pembayaran {
    
    @Override
    public double hitungPajak(double harga) {
        // Pajak 5% = 0.05
        return harga * 0.05;
    }
}

