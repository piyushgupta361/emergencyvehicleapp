package com.trainingapps.emergencyvehicleapp.vehiclerequestms.service;


import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.AddVehicleRequest;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.ChangeStatus;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.VehicleRequestDetails;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.exceptions.RequestNotFoundException;


public interface IVehicleRequestService {

   VehicleRequestDetails add(AddVehicleRequest request);

   VehicleRequestDetails findById(long requestId);

   VehicleRequestDetails changeStatus(ChangeStatus newStatus) throws RequestNotFoundException;

   }
