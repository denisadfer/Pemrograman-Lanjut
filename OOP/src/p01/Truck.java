/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01;

/**
 *
 * @author denisaditya
 */
public class Truck extends Mobil {
    @Override       //boleh itdak ditulis, sebaiknya ditulis
    public void maju() {
        this.velg.diameter=22;
        System.out.println("brrruuummm");
    }
}
