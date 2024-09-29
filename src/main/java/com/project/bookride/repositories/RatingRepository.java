package com.project.bookride.repositories;

import com.project.bookride.entities.Driver;
import com.project.bookride.entities.Rating;
import com.project.bookride.entities.Ride;
import com.project.bookride.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findByRider(Rider rider);
    List<Rating> findByDriver(Driver driver);

    Optional<Rating> findByRide(Ride ride);
}
