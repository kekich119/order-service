package com.kekich.payloadservice.service;

import com.kekich.payloadservice.model.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "topic-1", groupId = "kek")
    public void consumeOrderEvent(String message) {
        log.info("Received order event: {}", message);
        System.out.println(message);
    }
}
