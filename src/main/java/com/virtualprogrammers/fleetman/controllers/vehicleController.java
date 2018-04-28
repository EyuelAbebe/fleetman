package com.virtualprogrammers.fleetman.controllers;

import com.virtualprogrammers.fleetman.data.vehicleRepository;
import com.virtualprogrammers.fleetman.domain.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/website/vehicles")
public class vehicleController {

    @Autowired
    private vehicleRepository data;

    @RequestMapping(value = "/newVehicle.html", method = RequestMethod.POST)
    public String newVehicle(Vehicle vehicle){
        data.save(vehicle);
        return "redirect:/website/vehicles/list.html";
    }

    @RequestMapping(value = "/newVehicle.html", method = RequestMethod.GET)
    public ModelAndView renderNewVehicleForm(){
        Vehicle newVehicle = new Vehicle();
        return new ModelAndView("newVehicle", "form", newVehicle);
    }

    @RequestMapping(value = "/list.html", method = RequestMethod.GET)
    public ModelAndView vehicles(){
        List<Vehicle> allVehicles = data.findAll();
        return new ModelAndView("allVehicles", "vehicles", allVehicles);
    }

    @RequestMapping(value = "/vehicle/{name}")
    public ModelAndView showVehicleByName(@PathVariable("name") String name){
        throw new UnsupportedOperationException();
    }
}
