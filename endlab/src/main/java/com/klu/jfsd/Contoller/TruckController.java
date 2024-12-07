package com.klu.jfsd.Contoller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.jfsd.Service.TruckService;
import com.klu.jfsd.exam.Car;
import com.klu.jfsd.exam.Truck;

import java.util.List;

@RestController
@RequestMapping("/trucks")
public class TruckController {

    @Autowired
    private TruckService truckService;

    @PostMapping
    public String saveTruck(@RequestBody Truck truck) {
        truckService.saveTruck(truck);
        return "Truck saved!";
    }

    @GetMapping
    public List<Car> getAllTrucks() {
        return truckService.getAllTrucks();
    }
}

