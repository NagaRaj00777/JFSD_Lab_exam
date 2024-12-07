package com.klu.jfsd.Contoller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.jfsd.Service.CarService;
import com.klu.jfsd.exam.Car;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    public String saveCar(@RequestBody Car car) {
        carService.saveCar(car);
        return "Car saved!";
    }

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }
}

