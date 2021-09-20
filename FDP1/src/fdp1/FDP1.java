 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fdp1;

/**
 *
 * @author denisaditya
 */

import fdp1.GadgetFactory;
import fdp1.Gadget;

public class FDP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gadget phone = GadgetFactory.getGadget("phone", "8 GB", "128 GB", "Exynos 9852");
        Gadget tablet = GadgetFactory.getGadget("tablet", "3 GB", "64 GB", "A12 Bionic");
        Gadget laptop = GadgetFactory.getGadget("laptop", "8 GB", "500 GB", "i7");
        System.out.println("Phone Spec: " + phone);
        System.out.println("Tablet Spec: " + tablet);
        System.out.println("Laptop Spec: " + laptop);
    }
    
}
