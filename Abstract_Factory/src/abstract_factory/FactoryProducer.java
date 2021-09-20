/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory;

/**
 *
 * @author denisaditya
 */
public class FactoryProducer {
    
    public static AbstractFactory getFactory(String choice) {
//        if (choice.equalsIgnoreCase("SHAPE")) {
//            return new ShapeFactory();
//        } else if (choice.equalsIgnoreCase("COLOR")) {
//            return new ColorFactory();
//        }
//        return null;
          return choice.equalsIgnoreCase("SHAPE") ? new ShapeFactory()
               : choice.equalsIgnoreCase("COLOR") ? new ColorFactory()
               : null;
    }
}
