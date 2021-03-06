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
public class Abstract_Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
//get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
//call draw method of Shape Circle
        shape1.draw();
//get an object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
//call draw method of Shape Rectangle
        shape2.draw();
//get an object of Shape Square
        Shape shape3 = shapeFactory.getShape("SQUARE");
//call draw method of Shape Square
        shape3.draw();
//get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
//get an object of Color Red
        Color color1 = colorFactory.getColor("RED");
//call fill method of Red
        color1.fill();
//get an object of Color Green
        Color color2 = colorFactory.getColor("Green");
//call fill method of Green
        color2.fill();
//get an object of Color Blue
        Color color3 = colorFactory.getColor("Blue");
//call fill method of Blue
        color3.fill();
    }
    
}
