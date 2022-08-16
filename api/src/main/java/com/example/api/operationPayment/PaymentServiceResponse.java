package com.example.api.operationPayment;

import com.example.api.base.OperationResult;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class PaymentServiceResponse implements OperationResult {
    private Integer responseStatus;
    private String message;
}
