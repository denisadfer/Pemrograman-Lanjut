/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author denisaditya
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingleObject object1 = SingleObject.getInstance();
        object1.showMessage();
        
        DoubleObject object2 = DoubleObject.getInstance();
        object2.showMessage();
        
        ThirdObject object3 = ThirdObject.getInstance();
        object3.showMessage();
    }
    
}
