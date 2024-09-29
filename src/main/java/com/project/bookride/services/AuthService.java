package com.project.bookride.services;

import com.project.bookride.dto.DriverDto;
import com.project.bookride.dto.SignupDto;
import com.project.bookride.dto.UserDto;

public interface AuthService {

    String[] login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId, String vehicleId);

    String refreshToken(String refreshToken);
}
