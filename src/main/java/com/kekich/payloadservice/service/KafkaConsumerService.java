package com.kekich.payloadservice.service;

import com.kekich.payloadservice.model.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = "order-events", groupId = "your-group")
    public void consumeOrderEvent(OrderEvent orderEvent) {
        LOGGER.info("Received order event: {}", orderEvent);
    }
}
