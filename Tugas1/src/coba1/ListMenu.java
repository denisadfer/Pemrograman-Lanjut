/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba1;

/**
 *
 * @author denisaditya
 */

public class ListMenu {
public Menu getMenu (String jenisMenu){
    if (jenisMenu == null) {
            return null;
        }
        if (jenisMenu.equalsIgnoreCase("sate ayam")) {
            return new SateAyam();
        } else if (jenisMenu.equalsIgnoreCase("bakso")) {
            return new Bakso();
        } else if (jenisMenu.equalsIgnoreCase("es degan")) {
            return new EsDegan();
        }
        return null;
    }
}

