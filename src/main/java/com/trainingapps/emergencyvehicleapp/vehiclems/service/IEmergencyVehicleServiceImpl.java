package com.trainingapps.emergencyvehicleapp.vehiclems.service;

import com.trainingapps.emergencyvehicleapp.vehiclems.dto.AddEmergencyVehicleRequest;
import com.trainingapps.emergencyvehicleapp.vehiclems.dto.EmergencyVehicleDetails;
import com.trainingapps.emergencyvehicleapp.vehiclems.dto.UpdateVehicle;
import com.trainingapps.emergencyvehicleapp.vehiclems.entity.EmergencyVehicle;
import com.trainingapps.emergencyvehicleapp.vehiclems.exceptions.VehicleNotFoundException;
import com.trainingapps.emergencyvehicleapp.vehiclems.repository.IEmergencyVehicleRepository;
import com.trainingapps.emergencyvehicleapp.vehiclems.util.VehicleUtil;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.ChangeStatus;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.VehicleRequestDetails;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity.VehicleRequest;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.exceptions.RequestNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IEmergencyVehicleServiceImpl implements IEmergencyVehicleService{

    @Autowired
    private IEmergencyVehicleRepository vehicleRepo;

    @Autowired
    private VehicleUtil vehicleUtil;

    EmergencyVehicle vehicle ;

    @Override
    public EmergencyVehicleDetails add(AddEmergencyVehicleRequest request) {
        vehicle = new EmergencyVehicle();
        vehicle.setVehicleNumber(request.getVehicleNumber());
        vehicle.setVehicleColor(request.getVehicleColor());
        vehicle = vehicleRepo.save(vehicle);
        return vehicleUtil.toVehicleDetails(vehicle);
    }

    @Override
    public EmergencyVehicleDetails findVehicleDetailsByVehicleNumber(String vehicleNumber) {
        vehicle = new EmergencyVehicle();
        vehicle = vehicleRepo.findByVehicleNumber(vehicleNumber);
        return vehicleUtil.toVehicleDetails(vehicle);
    }

    @Override
    public EmergencyVehicleDetails update(UpdateVehicle request) throws VehicleNotFoundException {
        EmergencyVehicle eVehicle = vehicleUtil.toEVehicle(request);
        eVehicle = update(eVehicle);
        EmergencyVehicleDetails vehicle = vehicleUtil.toVehicleDetails(eVehicle);
        return  vehicle;
    }

    public EmergencyVehicle update(EmergencyVehicle vehicle) throws VehicleNotFoundException {
        boolean exists = vehicleRepo.existsById(vehicle.getId());
        if (!exists) {
            throw new VehicleNotFoundException("Vehicle not found for id=" + vehicle.getId());
        }
        vehicle = vehicleRepo.save(vehicle);
        return vehicle;
    }
}
