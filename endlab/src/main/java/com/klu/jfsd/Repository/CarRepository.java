package com.klu.jfsd.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klu.jfsd.exam.Car;
import com.klu.jfsd.exam.Truck;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

	void save(Truck truck);
}

