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

public abstract class Gadget {
	
	public abstract String getRAM();
	public abstract String getROM();
	public abstract String getProc();
	
	@Override
	public String toString(){
		return "RAM = "+this.getRAM()+", ROM = "+this.getROM()+", Processor = "+this.getProc();
	}
}

