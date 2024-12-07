package com.klu.jfsd.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.jfsd.Repository.CarRepository;
import com.klu.jfsd.exam.Car;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public void saveCar(Car car) {
        carRepository.save(car);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
}
