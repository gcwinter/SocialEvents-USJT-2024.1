/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielwinter.SocialEvents;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Winter
 */
public class ConnectionFactory {

    private String sgbd = "mysql";
    private String host = "mysql-3908a11c-gabrielcwinter-ef1c.b.aivencloud.com";
    private String port = "10097";
    private String user = "avnadmin";
    private String password = "AVNS_P3Fx6BB4TX8-du2qgdW";
    private String database = "social_events";

    public ConnectionFactory(String sgbd, String host, String port, String user, String password, String database) {
        this.sgbd = sgbd;
        this.host = host;
        this.port = port;
        this.user = user;
        this.password = password;
        this.database = database;
    }

    public ConnectionFactory() {
    }
    

    Connection conect() throws Exception {

        var stringConnection = String.format("jdbc:%s://%s:%s/%s", sgbd, host, port, database);
        return DriverManager.getConnection(stringConnection, user, password);

    }

}
