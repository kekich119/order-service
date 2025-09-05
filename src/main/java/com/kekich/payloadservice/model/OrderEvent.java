package com.kekich.payloadservice.model;


import lombok.Data;

@Data
public class OrderEvent {
    private String name;
    private String orderId;

}

