/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p02;

/**
 *
 * @author denisaditya
 */
public class Snack implements Barang {
    private int harga;
    public Snack(int h) {
        harga = h;
    }
    
    @Override
    public int getHarga() {
        return harga;
    }
    
}
