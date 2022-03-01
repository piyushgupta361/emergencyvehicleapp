package com.trainingapps.emergencyvehicleapp.vehiclems.util;

import com.trainingapps.emergencyvehicleapp.vehiclems.dto.EmergencyVehicleDetails;
import com.trainingapps.emergencyvehicleapp.vehiclems.dto.UpdateVehicle;
import com.trainingapps.emergencyvehicleapp.vehiclems.entity.EmergencyVehicle;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity.VehicleRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class VehicleUtil {
    public EmergencyVehicleDetails toVehicleDetails(EmergencyVehicle vehicle) {
        EmergencyVehicleDetails desired=new EmergencyVehicleDetails();
        BeanUtils.copyProperties(vehicle,desired);
        return desired;
    }

    public EmergencyVehicle toEVehicle(UpdateVehicle request) {
        EmergencyVehicle vehicle =new EmergencyVehicle();
        BeanUtils.copyProperties(request,vehicle);
        return vehicle;
    }
}
