package com.trainingapps.emergencyvehicleapp.vehiclems.dto;

import com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity.VehicleRequest;

public class UpdateVehicle {

    private long vehicleId;

    private String requestStatus;

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }


}
