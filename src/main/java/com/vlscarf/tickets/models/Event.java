package com.vlscarf.tickets.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long event_id;
    private String event_name;
    private int ammount_of_tickets;
    private String event_date;

    public String getDate() {
        return event_date;
    }

    public void setDate(String date) {
        this.event_date = date;
    }

    public Long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Long event_id) {
        this.event_id = event_id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }


    public int getAmmount_of_tickets() {
        return ammount_of_tickets;
    }

    public void setAmmount_of_tickets(int ammount_of_tickets) {
        this.ammount_of_tickets = ammount_of_tickets;
    }


}
