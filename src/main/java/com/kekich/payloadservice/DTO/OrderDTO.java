package com.kekich.payloadservice.DTO;

import lombok.Data;

import java.util.List;

@Data
public class OrderDTO {
    private int orderId;
    private List<Long> productIds;
    private double amount;
}
