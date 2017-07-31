package com.example.admin.durban_tour_guild_app;

/**
 * Created by Admin on 7/28/2017.
 */

public class Durban {

    String   head;
    String   description;
    String   photeUrl;
    String   address;
    String   hours;
    String   phone;

    public Durban(String mhead, String description, String photeUrl, String address, String hours, String phone) {
        this.head = mhead;
        this.description = description;
        this.photeUrl = photeUrl;
        this.address = address;
        this.hours = hours;
        this.phone = phone;
    }

    public Durban(String head, String description) {
        this.head = head;
        this.description = description;
    }

    public String getHead() {
        return head;
    }

    public String getDescription() {
        return description;
    }

    public String getPhoteUrl() {
        return photeUrl;
    }

    public String getAddress() {
        return address;
    }

    public String getHours() {
        return hours;
    }

    public String getPhone() {
        return phone;
    }


}
