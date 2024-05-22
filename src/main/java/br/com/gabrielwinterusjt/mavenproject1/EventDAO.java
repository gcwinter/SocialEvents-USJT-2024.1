/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielwinterusjt.mavenproject1;

import br.com.gabrielwinterusjt.mavenproject1.model.Event;
import java.util.ArrayList;

/**
 *
 * @author Winter
 */
public class EventDAO {

    public void create(Event event) throws Exception {

        var connection = new ConnectionFactory().conect();
        var sql = "INSERT INTO Events(Name, Description, DateTimeStart,DateTimeFinish) VALUES(?,?,?,?);";

        var prepareStatement = connection.prepareStatement(sql);

        prepareStatement.setString(1, event.getName());
        prepareStatement.setString(2, event.getDescription());
        prepareStatement.setString(3, event.getStart());
        prepareStatement.setString(4, event.getFinish());

        System.out.println(prepareStatement);

        prepareStatement.execute();
        prepareStatement.close();
        connection.close();
    }

    public ArrayList<Event> findAll() throws Exception {
        var listOfEvents = new ArrayList<Event>();
        var connection = new ConnectionFactory().conect();
        var sql = "SELECT * FROM Events";

        var ps = connection.prepareStatement(sql);
        var rs = ps.executeQuery();

        while (rs.next()) {

            Event eventDB = new Event();
            eventDB.setId(rs.getInt("ID"));
            eventDB.setName(rs.getString("Name"));
            eventDB.setDescription(rs.getString("Description"));
            eventDB.setStart(rs.getString("DateTimeStart"));
            eventDB.setFinish(rs.getString("DateTimeFinish"));

            listOfEvents.add(eventDB);

        }
        rs.close();
        ps.close();
        connection.close();
        System.out.println(listOfEvents);
        return listOfEvents;

    }

}
