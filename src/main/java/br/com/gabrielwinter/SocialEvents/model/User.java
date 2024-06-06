/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielwinter.SocialEvents.model;

/**
 *
 * @author Winter
 */
public class User {
    private boolean adm;
    private int id;
    private String login;
    private String password;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String cpf;

    @Override
    public String toString() {
        return "User{" + "adm=" + adm + ", id=" + id + ", login=" + login + ", password=" + password + ", name=" + name + ", age=" + age + ", gender=" + gender + ", email=" + email + ", cpf=" + cpf + '}';
    }

       public User(boolean adm, String login,
               String password, String name,
               int age, String gender,
               String email, String cpf) {
        this.adm = adm;
        this.login = login;
        this.password = password;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.cpf = cpf;
    }

    public User() {
    }
       

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

      public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
