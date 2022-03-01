package com.trainingapps.emergencyvehicleapp.vehiclerequestms.controller;

import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.AddVehicleRequest;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.ChangeStatus;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.VehicleRequestDetails;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.exceptions.RequestNotFoundException;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.service.IVehicleRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/vehicleRequest")
@RestController
public class VehicleRequestController {

    @Autowired
    private IVehicleRequestService service;


    @PostMapping("/add")
    public VehicleRequestDetails add(@RequestBody AddVehicleRequest request){
        return service.add(request);
    }


    @GetMapping("/{id}")
    VehicleRequestDetails findRequestDetailsById(@PathVariable long requestId)
    {
        return service.findById(requestId);
    }


    @PutMapping("/changestatus")
    public VehicleRequestDetails changeStatus(ChangeStatus newStatus) throws RequestNotFoundException {
      return service.changeStatus(newStatus);
    }

}
