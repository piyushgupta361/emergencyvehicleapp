package com.trainingapps.emergencyvehicleapp.vehiclems.service;

import com.trainingapps.emergencyvehicleapp.vehiclems.dto.AddEmergencyVehicleRequest;
import com.trainingapps.emergencyvehicleapp.vehiclems.dto.EmergencyVehicleDetails;
import com.trainingapps.emergencyvehicleapp.vehiclems.dto.UpdateVehicle;
import com.trainingapps.emergencyvehicleapp.vehiclems.exceptions.VehicleNotFoundException;

public interface IEmergencyVehicleService {

    EmergencyVehicleDetails add(AddEmergencyVehicleRequest request);

    EmergencyVehicleDetails findVehicleDetailsByVehicleNumber(String vehicleNumber);

    EmergencyVehicleDetails update(UpdateVehicle request) throws VehicleNotFoundException;

}
