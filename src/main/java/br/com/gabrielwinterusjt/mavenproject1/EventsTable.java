/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielwinterusjt.mavenproject1;

import br.com.gabrielwinterusjt.mavenproject1.model.Event;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Winter
 */
public class EventsTable {

    DefaultTableModel defaultTableModel = new DefaultTableModel();

    public DefaultTableModel listAllEvents() {

        ArrayList<Event> listOfEvents = new ArrayList<>();
        EventDAO eventDAO = new EventDAO();
        try {
            listOfEvents = eventDAO.findAll();

            defaultTableModel.addColumn("ID");
            defaultTableModel.addColumn("Name");
            defaultTableModel.addColumn("DateTimeStart");
            defaultTableModel.addColumn("DateTimeFinish");
            System.out.println(listOfEvents);
            for (Event event : listOfEvents) {
                defaultTableModel.addRow(
                        new Object[]{event.getId(),
                            event.getDescription(),
                            event.getStart(),
                            event.getFinish()}
                );

            }
                
        } catch (Exception e) {
        }
        return defaultTableModel;
    }
}
