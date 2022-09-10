package com.example.kafkaclient.consumer;

import com.example.kafkaclient.model.User;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class KafkaJsonConsumer {

    Logger logger = LoggerFactory.getLogger(KafkaJsonConsumer.class);

    @KafkaListener(topics = "TOPIC-DEMO-JSON", groupId = "group_id")
    public void consume(User message, Acknowledgment ack) {
        logger.info("Consuming Message {}", message);
        ack.acknowledge(); // <-- ack
    }

}