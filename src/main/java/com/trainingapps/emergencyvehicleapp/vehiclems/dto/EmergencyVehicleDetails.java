package com.trainingapps.emergencyvehicleapp.vehiclems.dto;

import java.util.Objects;
import java.util.Set;

public class EmergencyVehicleDetails {

    private long id;
    private String vehicleNum;


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getVehicleNum() {
        return vehicleNum;
    }


    public void setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmergencyVehicleDetails that = (EmergencyVehicleDetails) o;
        return id == that.id;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
