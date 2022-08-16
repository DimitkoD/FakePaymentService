package com.example.api.operationPayment;

import com.example.api.base.OperationInput;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PaymentServiceRequest implements OperationInput {
    private String cardNumber;
    private double totalPriceForRent;
}
