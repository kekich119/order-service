package com.kekich.payloadservice.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kekich.payloadservice.DTO.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumerService {



    @KafkaListener(topics = "topic-1", groupId = "kek")
    public void consumeOrderEvent(String message) {
        log.info("Received order event: {}", message);
        ObjectMapper mapper = new ObjectMapper();
        try {
            OrderDTO orderDTO = mapper.readValue(message, OrderDTO.class);
            log.info("Received order event: {}", orderDTO);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


    }
}
