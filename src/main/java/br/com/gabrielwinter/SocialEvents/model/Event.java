/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielwinter.SocialEvents.model;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Winter
 */
public class Event {

    private int id;
    private String name;
    private String description;
    private Date start;
    private Date finish;

    public void setId(int id) {
        this.id = id;
    }

    public Event() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

   
    public Event(int id, String name, String description, Date start, Date finish) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.start = start;
        this.finish = finish;
    }

    public int getId() {
        return id;
    }

    public Event(String name, String description, Date start, Date finish) {
        this.name = name;
        this.description = description;
        this.start = start;
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "Event{" + "id=" + id + ", name=" + name + ", description=" + description + ", start=" + start + ", finish=" + finish + '}';
    }

}
