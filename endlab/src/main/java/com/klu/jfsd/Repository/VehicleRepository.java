package com.klu.jfsd.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klu.jfsd.exam.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
