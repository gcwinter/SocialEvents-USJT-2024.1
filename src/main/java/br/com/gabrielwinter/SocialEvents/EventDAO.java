/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielwinter.SocialEvents;

import br.com.gabrielwinter.SocialEvents.model.Event;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Formatter;
import java.util.logging.SimpleFormatter;

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
        prepareStatement.setDate(3, event.getStart());
        prepareStatement.setDate(4, event.getFinish());

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
            eventDB.setStart(rs.getDate("DateTimeStart"));
            eventDB.setFinish(rs.getDate("DateTimeFinish"));

            listOfEvents.add(eventDB);

        }

        rs.close();
        ps.close();
        connection.close();

        return listOfEvents;

    }

    public ArrayList<Event> orderByName() throws Exception {

        ArrayList<Event> listOfEvents = findAll();
        Collections.sort(listOfEvents, (Event e1, Event e2) -> e1.getName().compareToIgnoreCase(e2.getName()));
        return listOfEvents;
    }

    public ArrayList<Event> orderByStart() throws Exception {

        ArrayList<Event> listOfEvents = findAll();
        Collections.sort(listOfEvents, (Event e1, Event e2) -> e1.getStart().compareTo(e2.getStart()));
        return listOfEvents;
    }

}
