package com.example.demo;
 // must match the package line of your Application class

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderPlacedListener {

    private static final Logger log = LoggerFactory.getLogger(OrderPlacedListener.class);

    @KafkaListener(topics = "order-placed")
    public void onOrderPlaced(String message) {
        log.info("Sending confirmation for: {}", message);
    }
}
