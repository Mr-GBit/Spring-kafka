package com.project.MessageApp.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "message-topic",groupId = "messageGroup")
    void listener(String data){
        System.out.println("Received: " + data);
    }
}
