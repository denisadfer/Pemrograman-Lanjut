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

public class Phone extends Gadget {

	private String ram;
	private String rom;
	private String proc;
	
	public Phone(String ram, String rom, String proc){
		this.ram=ram;
		this.rom=rom;
		this.proc=proc;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getROM() {
		return this.rom;
	}

	@Override
	public String getProc() {
		return this.proc;
	}

}

