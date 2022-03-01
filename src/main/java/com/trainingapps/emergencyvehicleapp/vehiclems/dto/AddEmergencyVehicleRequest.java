package com.trainingapps.emergencyvehicleapp.vehiclems.dto;

import com.trainingapps.emergencyvehicleapp.vehiclems.entity.VehicleColor;

public class AddEmergencyVehicleRequest {

    private String vehicleNumber; // string with 10 length
    private VehicleColor vehicleColor;


    public String getVehicleNumber() {
        return vehicleNumber;
    }


    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }


    public VehicleColor getVehicleColor() {
        return vehicleColor;
    }


    public void setVehicleColor(VehicleColor vehicleColor) {
        this.vehicleColor = vehicleColor;
    }
}
