package com.project.bookride.services;

import com.project.bookride.entities.Driver;
import com.project.bookride.entities.Ride;
import com.project.bookride.entities.RideRequest;
import com.project.bookride.entities.Rider;
import com.project.bookride.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    Ride createNewRide(RideRequest rideRequest, Driver driver);

    Ride updateRideStatus(Ride ride, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Rider rider, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Driver driver, PageRequest pageRequest);
}
