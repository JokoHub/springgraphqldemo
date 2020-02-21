package com.joko.graphqldemo.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.joko.graphqldemo.entity.Vehicle;
import com.joko.graphqldemo.service.VehicleService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

    private VehicleService vehicleService;

    public VehicleQuery(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    public List<Vehicle> getVehicles(int count){
        return vehicleService.getAllVehicles(count);
    }

    public Optional<Vehicle> getVehicle(int id){
        return vehicleService.getVehicle(id);
    }
}
