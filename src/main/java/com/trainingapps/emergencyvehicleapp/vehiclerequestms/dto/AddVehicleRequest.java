package com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto;

import com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity.RequestStatus;

public class AddVehicleRequest {

    private String address ;
    private String pincode;
    private String phoneNumber;
    private RequestStatus requestStatus;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }
}
