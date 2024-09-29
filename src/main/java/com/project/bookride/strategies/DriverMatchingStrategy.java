package com.project.bookride.strategies;

import com.project.bookride.entities.Driver;
import com.project.bookride.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
