/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielwinter.SocialEvents;

import br.com.gabrielwinter.SocialEvents.model.Event;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Winter
 */
public class EventsTable {

    NonEditableEventTable nonEditableTableModel = new NonEditableEventTable();
    ArrayList<Event> listOfEvents = new ArrayList<>();
    EventDAO eventDAO = new EventDAO();

    private void feedTable(ArrayList<Event> listOfEvents) {

        nonEditableTableModel.addColumn("ID");
        nonEditableTableModel.addColumn("Name");
        nonEditableTableModel.addColumn("Descripition");
        nonEditableTableModel.addColumn("DateTimeStart");
        nonEditableTableModel.addColumn("DateTimeFinish");

        for (Event event : listOfEvents) {
            nonEditableTableModel.addRow(
                    new Object[]{event.getId(),
                        event.getName(),
                        event.getDescription(),
                        event.getStart(),
                        event.getFinish()}
            );

        }
    }

    public DefaultTableModel listAllEvents() {

        try {

            listOfEvents = eventDAO.findAll();
            feedTable(listOfEvents);

        } catch (Exception e) {
        }
        return nonEditableTableModel;
    }

    public DefaultTableModel listAllEventsByName() {
        try {

            listOfEvents = eventDAO.orderByName();
            feedTable(listOfEvents);

        } catch (Exception e) {
        }
        return nonEditableTableModel;
    }

    public DefaultTableModel listAllEventsByStart() {

        try {

            listOfEvents = eventDAO.orderByStart();
            feedTable(listOfEvents);

        } catch (Exception e) {
        }
        return nonEditableTableModel;
    }

    public void clearTable() {
        this.nonEditableTableModel.setRowCount(0);
        this.nonEditableTableModel.setColumnCount(0);
              
    }

   

    
}
