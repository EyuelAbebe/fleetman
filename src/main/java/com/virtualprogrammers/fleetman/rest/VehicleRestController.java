package com.virtualprogrammers.fleetman.rest;

import com.virtualprogrammers.fleetman.domain.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virtualprogrammers.fleetman.data.vehicleRepository;

import java.util.List;

@RestController
public class VehicleRestController {

    @Autowired
    private vehicleRepository data;

    @RequestMapping("/vehicles")
    public VehicleList allVehicles(){
        List<Vehicle> all = data.findAll();

        return new VehicleList(all);
    }

    @RequestMapping(value = "/vehicles", method = RequestMethod.POST)
    public ResponseEntity<Vehicle> CreateANewVehicle(@RequestBody Vehicle vehicle){
        data.save(vehicle);
        return new ResponseEntity<Vehicle>(vehicle, HttpStatus.CREATED);
    }
}
