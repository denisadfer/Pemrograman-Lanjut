/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba1;

/**
 *
 * @author denisaditya
 */
public class SateAyam implements Menu {
    private int jumlah;
    int harga=15000;

    @Override
    public void menu() {
        System.out.println("Sate Ayam");
    }
    public int total(int x) {
        jumlah = x;
        return jumlah*harga;
    }
//    public int total(int x) {
//        jumlah = x;
//        return 0;
//    }
//    public SateAyam(int x) {
//        jumlah = x;
//    }

//    @Override
//    public int harga() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    @Override
//    public int total() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public int total() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int jumlah() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
