package org.example.consumer.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @KafkaListener(topics = "${kafka.topic.name}", groupId = "${kafka.consumer.group.id}")
    public void consume(ConsumerRecord<String, String> record) {
        System.out.println("Consumed message: " + record.value());
    }

}
