/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01;

import onderdil.Velg;
/**
 *
 * @author denisaditya
 */
public class Mobil {
    public String merk;
    public String warna;
    protected Velg velg;
    //constructor
    public Mobil() {
        warna="hitam";
        velg = new Velg();
        velg.diameter=15;
    }
    public Mobil(String w) {  //overloading
        warna=w;
    }  
    public Mobil(String w, String m){
        merk=m;
        warna=w;
    }
    public void maju(){
        System.out.println("ngenggggg");
    }
    public void mundur() {
        System.out.println("tiiiit.....");        
    }
    public void setVelg(Velg v) {
        this.velg = v;
    }
    public Velg getVelg() {
        return this.velg;
    }
}
