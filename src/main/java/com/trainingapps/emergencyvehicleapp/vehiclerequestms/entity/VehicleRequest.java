package com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity;


import javax.persistence.*;

@Entity
public class VehicleRequest {

    @Id
    @GeneratedValue
    Long id ;

    @OneToOne(targetEntity = HouseAddress.class, cascade = CascadeType.ALL)
    HouseAddress address ;

    String pincode;
    String phoneNumber;
    RequestStatus requestStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HouseAddress getAddress() {
        return address;
    }

    public void setAddress(HouseAddress address) {
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
