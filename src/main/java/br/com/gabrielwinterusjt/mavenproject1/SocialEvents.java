/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielwinterusjt.mavenproject1;

/**
 *
 * @author Winter
 */
public class SocialEvents {

    public static void main(String[] args) {
        var user = new User(false,"joao", "admin", "pedro souza",27,"male", "pedrosouza@gemail.com", "44444444444");
        
 
        
        UserDAO userDAO = new UserDAO();
        
               

        try {
           
            userDAO.create(user);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
