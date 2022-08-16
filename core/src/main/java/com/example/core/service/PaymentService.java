package com.example.core.service;

import com.example.api.operationPayment.PaymentServiceRequest;
import com.example.api.operationPayment.PaymentServiceResponse;

public interface PaymentService {
    PaymentServiceResponse payRent(PaymentServiceRequest paymentServiceRequest);
}
