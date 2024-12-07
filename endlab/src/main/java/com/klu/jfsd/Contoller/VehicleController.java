package com.klu.jfsd.Contoller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.jfsd.Service.VehicleService;
import com.klu.jfsd.exam.Vehicle;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public String saveVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.saveVehicle(vehicle);
        return "Vehicle saved!";
    }

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }
}

