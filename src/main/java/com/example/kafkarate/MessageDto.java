package com.example.kafkarate;

import lombok.Data;

@Data
public class MessageDto {
    String message;
    long timestamp;
    String symbol;
    String venue;
    String side;
    double price;
    double size;
    String orderType;
    String orderStatus;
    String orderID;
    String clientOrderID;
    String orderRejectReason;
    String orderCancelRejectReason;
    String orderCancelReason;
    String orderExecutionType;
    String orderTimeInForce;
    String orderCapacity;
    String orderRestriction;
    String orderOrigination;
    String orderHandlingInstruction;
    String orderTradingSessionSubID;
    String orderTradingSessionID;
    String orderTradingSessionDate;
    String orderTradingSessionTime;
    String orderTradingSessionTimeZone;

}
