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
public class ThirdObject {
    private static ThirdObject instance = new ThirdObject();
    
    //make the constructor private so that this class cannot be instantiated
    
    private ThirdObject() {
        
    }
    //Get the only object available
    
    public static ThirdObject getInstance() {
        return instance;
    }
    
    public void showMessage() {
        System.out.println("This is ThirdObject");
    }
}
