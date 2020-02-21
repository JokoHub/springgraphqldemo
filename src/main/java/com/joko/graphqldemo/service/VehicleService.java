package com.joko.graphqldemo.service;

import com.joko.graphqldemo.entity.Vehicle;
import com.joko.graphqldemo.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehicleService {
    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle createVehicle(String type, String modelCode, String brandName, String launchDate){
        Vehicle vehicle = new Vehicle();
        vehicle.setType(type);
        vehicle.setModelCode(modelCode);
        vehicle.setBrandName(brandName);
        vehicle.setLaunchDate(LocalDate.parse(launchDate));
        return vehicleRepository.save(vehicle);
    }

    public List<Vehicle> getAllVehicles(int count){
        return vehicleRepository.findAll().stream().limit(10).collect(Collectors.toList());
    }

    public Optional<Vehicle> getVehicle(int id){
        return vehicleRepository.findById(id);
    }
}
