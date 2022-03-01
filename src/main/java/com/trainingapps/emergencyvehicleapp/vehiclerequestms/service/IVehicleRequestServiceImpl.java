package com.trainingapps.emergencyvehicleapp.vehiclerequestms.service;

import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.AddVehicleRequest;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.ChangeStatus;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.VehicleRequestDetails;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity.HouseAddress;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity.VehicleRequest;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.exceptions.RequestNotFoundException;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.repository.IVehicleRequestRepository;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.util.VehicleRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IVehicleRequestServiceImpl implements IVehicleRequestService {

    @Autowired
    private IVehicleRequestRepository vehicleRepo;

    @Autowired
    private VehicleRequestUtil vehicleUtil;

    VehicleRequest vRequest;

    @Override
    public VehicleRequestDetails add(AddVehicleRequest request) {
        vRequest = new VehicleRequest();
        vRequest.setPincode(request.getPincode());
        vRequest.setPhoneNumber(request.getPhoneNumber());
        System.out.println("pincode data -->"+request.getPincode());
        System.out.println("Phone data -->"+request.getPhoneNumber());
        System.out.println("Address data -->"+request.getAddress());
        String address[] = request.getAddress().split(" ");
        for(String s:address)
            System.out.println("txt -->"+s);
        String city = address[0];
        String street = address[1];
        String houseNumber = address[2];
        HouseAddress houseAddress = new HouseAddress();
        houseAddress.setHouseNumber(houseNumber);
        houseAddress.setCity(city);
        houseAddress.setStreet(street);
        vRequest.setAddress(houseAddress);
        System.out.println("request status -->"+request.getRequestStatus());
        vRequest.setRequestStatus(request.getRequestStatus());
        System.out.println("going to save status -->");
        vRequest = vehicleRepo.save(vRequest);
        System.out.println("after save status -->");
        return vehicleUtil.toVehicleRequestDetails(vRequest);
    }

    @Override
    public VehicleRequestDetails findById(long requestId) {
        vRequest = new VehicleRequest();
        System.out.println("for find by id --->"+requestId);
        vRequest = vehicleRepo.findById(requestId);
        System.out.println("after find by id --->"+requestId);
        return vehicleUtil.toVehicleRequestDetails(vRequest);
    }

    @Override
    public VehicleRequestDetails changeStatus(ChangeStatus newStatus) throws RequestNotFoundException {
        VehicleRequest vehicle  = vehicleUtil.toVehicleReq(newStatus);
        vehicle = update(vehicle);
        VehicleRequestDetails vehi = vehicleUtil.toVehicleRequestDetails(vehicle);
        return vehi;

    }

    public VehicleRequest update(VehicleRequest vehicle) throws RequestNotFoundException {
        boolean exists = vehicleRepo.existsById(vehicle.getId());
        if (!exists) {
            throw new RequestNotFoundException("Request not found for id=" + vehicle.getId());
        }
        vehicle = vehicleRepo.save(vehicle);
        return vehicle;
    }

}
