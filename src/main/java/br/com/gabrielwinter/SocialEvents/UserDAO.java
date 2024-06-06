/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielwinter.SocialEvents;

import br.com.gabrielwinter.SocialEvents.model.User;

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

    public User find(User user) throws Exception {

        var connection = new ConnectionFactory().conect();
        var sql = "SELECT * FROM User WHERE login = ? AND password = ?";

        var ps = connection.prepareStatement(sql);
        ps.setString(1, user.getLogin());
        ps.setString(2, user.getPassword());

        var rs = ps.executeQuery();
        
        var existUser = rs.next();
        

        User userDB = new User();
        userDB.setAdm(rs.getBoolean("adm"));
        userDB.setLogin(user.getLogin());
        userDB.setPassword(user.getPassword());
        userDB.setName(rs.getString("name"));
        userDB.setAge(rs.getInt("age"));
        userDB.setGender(rs.getString("gender"));
        userDB.setEmail(rs.getString("email"));
        userDB.setCpf(rs.getString("cpf"));
        
        System.out.println(userDB);
        
        rs.close();
        ps.close();
        connection.close();
        
    

        return userDB;

    }
    public Boolean exist(User user) throws Exception{
        
        var connection = new ConnectionFactory().conect();
        var sql = "SELECT * FROM User WHERE login = ? AND password = ?";

        var ps = connection.prepareStatement(sql);
        ps.setString(1, user.getLogin());
        ps.setString(2, user.getPassword());

        var rs = ps.executeQuery();
        var existUser = rs.next();
        
      
        
        rs.close();
        ps.close();
        connection.close();
        
      
        return existUser;
    }

}
