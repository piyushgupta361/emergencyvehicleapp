package com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity;

import javax.persistence.*;
import java.util.Objects;

@Table(name="address")
@Entity
public class HouseAddress {

    @GeneratedValue
    @Id
    private long id;

    private String city;

    private String street;

    private String houseNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

}
