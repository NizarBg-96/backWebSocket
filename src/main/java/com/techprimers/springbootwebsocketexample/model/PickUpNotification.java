package com.techprimers.springbootwebsocketexample.model;

import java.util.Date;

public class PickUpNotification {
    String id ;
    String avatar;
    String userName;
    Date date;
    double price;
    double distance;
    String addFrom;
    String addTo;
    LatLng locationFrom;
    LatLng locationTo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getAddFrom() {
        return addFrom;
    }

    public void setAddFrom(String addFrom) {
        this.addFrom = addFrom;
    }

    public String getAddTo() {
        return addTo;
    }

    public void setAddTo(String addTo) {
        this.addTo = addTo;
    }

    public LatLng getLocationFrom() {
        return locationFrom;
    }

    public void setLocationFrom(LatLng locationFrom) {
        this.locationFrom = locationFrom;
    }

    public LatLng getLocationTo() {
        return locationTo;
    }

    public void setLocationTo(LatLng locationTo) {
        this.locationTo = locationTo;
    }
}
