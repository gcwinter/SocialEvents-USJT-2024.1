/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielwinterusjt.mavenproject1;

/**
 *
 * @author Winter
 */
public class UserDAO {

    public void create(User user) throws Exception {

        var connection = new ConnectionFactory().conect();
        var sql = "INSERT INTO User (adm,login,password,name,age,gender,email,cpf) VALUES (?,?,?,?,?,?,?,?);";
        var prepareStatement = connection.prepareStatement(sql);
        prepareStatement.setBoolean(1, user.isAdm());
        prepareStatement.setString(2, user.getLogin());
        prepareStatement.setString(3, user.getPassword());
        prepareStatement.setString(4, user.getName());
        prepareStatement.setInt(5, user.getAge());
        prepareStatement.setString(6, user.getGender());
        prepareStatement.setString(7, user.getEmail());
        prepareStatement.setString(8, user.getCpf());

        System.out.println(prepareStatement);

        prepareStatement.execute();
        prepareStatement.close();
        connection.close();
    }

    public Boolean find(User user) throws Exception {

        var connection = new ConnectionFactory().conect();
        var sql = "SELECT * FROM User WHERE login = ? AND password = ?";

        var prepareStatement = connection.prepareStatement(sql);
        prepareStatement.setString(1, user.getLogin());
        prepareStatement.setString(2, user.getPassword());

        var resultStatement = prepareStatement.executeQuery();
        var existUser = resultStatement.next();
        
        resultStatement.close();
        prepareStatement.close();
        connection.close();
        
        System.out.println(existUser);

        return existUser;

    }

}
