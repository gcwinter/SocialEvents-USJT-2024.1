/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielwinterusjt.mavenproject1;

import br.com.gabrielwinterusjt.mavenproject1.model.User;
import br.com.gabrielwinterusjt.mavenproject1.pages.LoginPage;

/**
 *
 * @author Winter
 */
public class SocialEvents {

    public static void main(String[] args) {
                       

        try {
           
            LoginPage loginPage = new LoginPage();
            loginPage.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
