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

import fdp1.Gadget;
import fdp1.Phone;
import fdp1.Tablet;

public class GadgetFactory {

	public static Gadget getGadget(String type, String ram, String rom, String proc){
                return "Phone".equalsIgnoreCase(type) ? new Phone(ram, rom, proc) 
                     : "Tablet".equalsIgnoreCase(type) ? new Tablet(ram, rom, proc)
                     : null;
                //if("Phone".equalsIgnoreCase(type)) return new Phone(ram, rom, proc);
		//else if("Tablet".equalsIgnoreCase(type)) return new Tablet(ram, rom, proc);		
                //return null;
	}
}

