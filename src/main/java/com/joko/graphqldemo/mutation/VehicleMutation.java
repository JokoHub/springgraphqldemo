package com.joko.graphqldemo.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.joko.graphqldemo.entity.Vehicle;
import com.joko.graphqldemo.service.VehicleService;
import org.springframework.stereotype.Component;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

    private VehicleService vehicleService;

    public VehicleMutation(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    public Vehicle createVehicle(String type, String modelCode, String brandName, String launchDate){
        return vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }

}
