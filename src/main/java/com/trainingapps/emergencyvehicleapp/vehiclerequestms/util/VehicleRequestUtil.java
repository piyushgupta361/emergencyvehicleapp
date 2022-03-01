package com.trainingapps.emergencyvehicleapp.vehiclerequestms.util;

import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.ChangeStatus;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.dto.VehicleRequestDetails;
import com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity.VehicleRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class VehicleRequestUtil {

    public VehicleRequestDetails toVehicleRequestDetails(VehicleRequest vRequest) {
        VehicleRequestDetails vehicleDetail = new VehicleRequestDetails();
        BeanUtils.copyProperties(vRequest,vehicleDetail);
        return vehicleDetail;
    }

    public VehicleRequest toVehicleReq(ChangeStatus request){
        VehicleRequest vehicle =new VehicleRequest();
        BeanUtils.copyProperties(request,vehicle);
        return vehicle;
    }
}
