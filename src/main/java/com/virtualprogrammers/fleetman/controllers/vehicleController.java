package com.virtualprogrammers.fleetman.controllers;

import com.virtualprogrammers.fleetman.domain.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/website/vehicles")
public class vehicleController {

    @Autowired
    private vehicleRepository data;

    @RequestMapping(value = "/newVehicle.html", method = RequestMethod.POST)
    public String newVehicle(Vehicle vehicle){

    }

    @RequestMapping(value = "/newVehicle.html", method = RequestMethod.GET)
    public ModelAndView renderNewVehicleForm(){

    }

    @RequestMapping(value = "/list.html", method = RequestMethod.GET)
    public String vehicles(){
        //TODO
    }

    @RequestMapping(value = "/vehicle/{name}")
    public ModelAndView showVehicleByName(@PathVariable("name") String name){
        //TODO
    }
}
