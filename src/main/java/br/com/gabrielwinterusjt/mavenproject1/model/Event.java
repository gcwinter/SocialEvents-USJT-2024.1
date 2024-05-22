/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielwinterusjt.mavenproject1.model;

import java.time.LocalDateTime;

/**
 *
 * @author Winter
 */
public class Event {

    private int id;
    private String name;
    private String description;
    private String start;
    private String finish;

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

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public Event(int id, String name, String description, String start, String finish) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.start = start;
        this.finish = finish;
    }

    public int getId() {
        return id;
    }

    public Event(String name, String description, String start, String finish) {
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
