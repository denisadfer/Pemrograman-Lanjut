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
public class EsDegan implements Menu {
    private int jumlah;
    int harga=8000;

    EsDegan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void menu() {
        System.out.println("Es Degan");
    }
    public int jumlah() {
        return jumlah*harga;
    }
    public EsDegan(int x) {
        jumlah = x;
    }

    @Override
    public int harga() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void jumlah(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
