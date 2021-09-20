/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import p01.Mobil;
import p01.Truck;

/**
 *
 * @author denisaditya
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Truck trek = new Truck();
        System.out.println(trek.warna);
        trek.maju();
        System.out.println(trek.getVelg().diameter);
        System.out.println(trek.getVelg().getMerk());
        Mobil colt = new Mobil();
        Mobil jazz = new Mobil("biru");
        Mobil panther = new Mobil("merah","isuzu");
        colt.maju();
        colt.mundur();
        System.out.println(colt.warna);
        colt.warna="putih";
        colt.merk="suzuki";
        System.out.println(colt.warna);
        System.out.println(jazz.warna);
        System.out.println(panther.warna);
        System.out.println(panther.merk);
    }
    
}
