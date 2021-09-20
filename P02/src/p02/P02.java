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
public class P02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Barang top = new Snack(500);
        System.out.println(top.getHarga());
        top = new Baju();
        System.out.println(top.getHarga());
    }
    
}
