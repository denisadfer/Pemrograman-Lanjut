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
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListMenu listMenu = new ListMenu();
        
        Menu SA = listMenu.getMenu("sate ayam");
        SA.menu();
        Menu sa = new SateAyam();
        System.out.println(sa.total());
        
        //System.out.println("Harga : " + SA.jumlah(2));
        
       
    }
    
}
