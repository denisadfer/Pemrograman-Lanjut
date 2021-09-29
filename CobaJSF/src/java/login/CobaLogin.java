/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package login;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author denisaditya
 */

@ManagedBean(name = "cobaLogin", eager = true)
public class CobaLogin {

    public CobaLogin() {
        System.out.println("HelloWorld started!");
    }

    public String getMessage() {
        return "Hello World! Selamat belajar JSF";
    }
}
