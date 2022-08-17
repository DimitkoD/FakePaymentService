package com.example.core.service.implementation;

import com.example.api.operationPayment.PaymentServiceRequest;
import com.example.api.operationPayment.PaymentServiceResponse;
import com.example.core.service.PaymentService;
import com.example.core.service.exception.PaymentServiceException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    private int lowBoundary = 0;
    private int highBoundary = 1000;

    @Override
    public PaymentServiceResponse payRent(PaymentServiceRequest paymentServiceRequest) {

        double randomBalance = Math.random() * (highBoundary - lowBoundary) + lowBoundary;

        try{
            if(paymentServiceRequest.getCardNumber().length() != 16) {
                return PaymentServiceResponse
                    .builder()
                    .responseStatus(400)
                    .message("Credit Card is not valid!!!")
                    .build();
            }

            if(paymentServiceRequest.getTotalPriceForRent() > randomBalance) {
                return PaymentServiceResponse
                    .builder()
                    .responseStatus(400)
                    .message("Credit Card Balance is not valid!!!")
                    .build();
            }

            return PaymentServiceResponse
                .builder()
                .responseStatus(200)
                .message("Payment is successful!")
                .build();

        } catch(Exception e) {
            throw new PaymentServiceException();
        }

    }
}
