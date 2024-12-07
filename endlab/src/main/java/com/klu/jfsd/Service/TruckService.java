package com.klu.jfsd.Service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.jfsd.Repository.CarRepository;
import com.klu.jfsd.exam.Car;
import com.klu.jfsd.exam.Truck;

import java.util.List;

@Service
public class TruckService {

    @Autowired
    private CarRepository truckRepository;

    public void saveTruck(Truck truck) {
        truckRepository.save(truck);
    }

    public List<Car> getAllTrucks() {
        return truckRepository.findAll();
    }
}

