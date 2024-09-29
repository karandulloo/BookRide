package com.project.bookride.services;

import com.project.bookride.dto.DriverDto;
import com.project.bookride.dto.RiderDto;
import com.project.bookride.entities.Ride;

public interface RatingService {

    DriverDto rateDriver(Ride ride, Integer rating);
    RiderDto rateRider(Ride ride, Integer rating);

    void createNewRating(Ride ride);
}
