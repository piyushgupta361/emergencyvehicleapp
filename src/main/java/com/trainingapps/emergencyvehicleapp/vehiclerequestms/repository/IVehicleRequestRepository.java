package com.trainingapps.emergencyvehicleapp.vehiclerequestms.repository;

import com.trainingapps.emergencyvehicleapp.vehiclerequestms.entity.VehicleRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface IVehicleRequestRepository extends JpaRepository<VehicleRequest, Long> {

    @Query("from VehicleRequest where id=:idParam")
    VehicleRequest findById(@Param("idParam")  long id);

}
