package com.trainingapps.emergencyvehicleapp.vehiclems.controller;

import com.trainingapps.emergencyvehicleapp.vehiclems.dto.AddEmergencyVehicleRequest;
import com.trainingapps.emergencyvehicleapp.vehiclems.dto.EmergencyVehicleDetails;
import com.trainingapps.emergencyvehicleapp.vehiclems.dto.UpdateVehicle;
import com.trainingapps.emergencyvehicleapp.vehiclems.exceptions.VehicleNotFoundException;
import com.trainingapps.emergencyvehicleapp.vehiclems.service.IEmergencyVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
@RequestMapping("/vehicle")
@RestController
public class VehicleRestController {


    @Autowired
    private IEmergencyVehicleService vehicleService;


    @PostMapping("/add")
    public EmergencyVehicleDetails add(@RequestBody @NotNull @Valid AddEmergencyVehicleRequest request){
        return vehicleService.add(request);
    }


    @GetMapping("/{vehicleNum}")
    public EmergencyVehicleDetails findVehicleDetailsByVehicleNumber(@PathVariable @NotNull @Valid String vehNum) throws Exception{
        return vehicleService.findVehicleDetailsByVehicleNumber(vehNum);
    }


    @PostMapping("/update")
    public EmergencyVehicleDetails update(UpdateVehicle request) throws VehicleNotFoundException {
        return vehicleService.update(request);
    }
}
