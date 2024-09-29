package com.project.bookride.services;

import com.project.bookride.dto.DriverDto;
import com.project.bookride.dto.RideDto;
import com.project.bookride.dto.RideRequestDto;
import com.project.bookride.dto.RiderDto;
import com.project.bookride.entities.Rider;
import com.project.bookride.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
