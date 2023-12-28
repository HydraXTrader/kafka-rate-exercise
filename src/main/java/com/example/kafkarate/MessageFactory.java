package com.example.kafkarate;

public class MessageFactory {
    public static MessageDto createMessage(String message, int i) {
        MessageDto msg = new MessageDto();
        msg.setMessage(message+":"+i);
        msg.setTimestamp(System.currentTimeMillis());
        msg.setSymbol("AAPL");
        msg.setVenue("NASDAQ");
        msg.setSide("BUY");
        msg.setPrice(100.0);
        msg.setSize(100.0);
        msg.setOrderType("LIMIT");
        msg.setOrderStatus("NEW");
        msg.setOrderID("123456789");
        msg.setClientOrderID("123456789");
        msg.setOrderRejectReason("NONE");
        msg.setOrderCancelRejectReason("NONE");
        msg.setOrderCancelReason("NONE");
        msg.setOrderExecutionType("NEW");
        msg.setOrderTimeInForce("DAY");
        msg.setOrderCapacity("AGENT");
        msg.setOrderRestriction("NONE");
        msg.setOrderOrigination("NONE");
        msg.setOrderHandlingInstruction("NONE");
        msg.setOrderTradingSessionSubID("NONE");
        msg.setOrderTradingSessionID("NONE");
        msg.setOrderTradingSessionDate("NONE");
        msg.setOrderTradingSessionTime("NONE");
        msg.setOrderTradingSessionTimeZone("NONE");
        return msg;
    }
}
