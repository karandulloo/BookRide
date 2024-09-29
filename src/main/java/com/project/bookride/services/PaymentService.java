package com.project.bookride.services;

import com.project.bookride.entities.Payment;
import com.project.bookride.entities.Ride;
import com.project.bookride.entities.enums.PaymentStatus;

public interface PaymentService {

    void processPayment(Ride ride);

    Payment createNewPayment(Ride ride);

    void updatePaymentStatus(Payment payment, PaymentStatus status);
}
