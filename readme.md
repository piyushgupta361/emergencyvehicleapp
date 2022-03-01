



Emergency Vehicle Management





    	Vehicle Request
    	
     	Vehicle Assigned
     	
       Vehicle Module






Group id

com.trainingapps

Artificat id

emergencyvehicleapp

Base Package

com.trainingapps.emergencyvehicleapp





Case Study / Problem Statement


As in India, many people die due to an ambulance being late or patients can't be admitted to the hospital on time.

This application will provide continuous monitoring of ambulance so that it can reach to destination without delay.






Emergency vehicle module

Base Package

com.trainingapps.emergencyvehicleapp.vehiclems


Entity
EmergencyVehicle{

Long id

//VehicleOwner owner

String vehicleNumber// string with 10 length

VehicleColor vehicleColor  //enum constant color can be white , blue ;

}


Repository

IEmergencyVehicleRepository{
....
}

Service

IEmergencyVehicleService{

EmergencyVehicleDetails add(AddEmergencyVehicleRequest request)

EmergencyVehicleDetails findVehicleDetailsByVehicleNumber(String vehicleNumber)

EmergencyVehicleDetails update(UpdateVehicle request)

........
}




VehicleRequest Module



Base Package

com.trainingapps.emergencyvehicleapp.vehiclerequestms

VehicleRequest{

Long id //request id


HouseAddress address

String pincode

String phoneNumber

//LocalDateTime requestedDateTime //datetime at which requst is created

RequestStatus requestStatus //RequestStatus is enum values can be pending , progress, closed 
......
}

HouseAddress{
id: Long //addressId

city: String

street: String

houseNumber: String

}

IVehicleRequestRepository{
.....
}

IVehicleRequestService{

VehicleRequestDetails add(AddVehichleRequest request)

VehicleRequestDetails findRequestDetailsById(Long id)

VehicleRequestDetails changeStatus(String newStatus)

.............
}




Vehicle Assigned Module


Base Package

com.trainingapps.emergencyvehicleapp.vehicleassignedms

Entity

VehicleAssigned{
 
 Long id 

 VehicleRequest request

EmergencyVehicle vehicle

 //LocalDateTime startDateTime

// LocalDateTime assignedTime //datetime at which was assigned 

//LocalDateTime endDateTime //datetime at which job was finished 
.....
}

Repository

IVehicleAssignedRepository{
 ....
}


Service

IVehicleAssignedService{

 VehicleAssignedDetails add(VehicleAssigned request)

VehicleAssignedDetails findVehicleAssignedByRequestId(Long id)

VehicleAssignedDetails updateVehicleAssigned(UpdateVehicleAssigned request)


}





