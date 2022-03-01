package com.trainingapps.emergencyvehicleapp.vehiclems.repository;

import com.trainingapps.emergencyvehicleapp.vehiclems.entity.EmergencyVehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmergencyVehicleRepository extends JpaRepository<EmergencyVehicle,Long> {

    @Query("from EmergencyVehicle where vehicleNumber=:vehicleNumberParam")
    EmergencyVehicle findByVehicleNumber(@Param("vehicleNumberParam") String vehicleNumber);



}
