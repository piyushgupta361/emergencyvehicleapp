package com.trainingapps.emergencyvehicleapp.vehiclems.entity;

import com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity.VehicleRequest;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Objects;

@Table(name="vehicle")
@Entity
public class EmergencyVehicle {

    @GeneratedValue
    @Id
    private Long id;
    @Size(min=1,max=10)
    private String vehicleNumber; // string with 10 length
    private VehicleColor vehicleColor;  //enum constant color can be white , blue ;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmergencyVehicle vehicle = (EmergencyVehicle) o;
        return Objects.equals(id, vehicle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
