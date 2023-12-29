package com.example.kafkarate;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/kafka")
public class KafkaProducerController {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC_NAME = "my-topic";
    private static final int NUM_MESSAGE = 1000000;

    @Autowired
    public KafkaProducerController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/produce")
    public String produceMessage(@RequestBody String message) {

        System.out.println(new Date()+" - Start producing "+NUM_MESSAGE+" message: "+message);
        for (int i = 0; i < NUM_MESSAGE; i++) {
            MessageDto msg = MessageFactory.createMessage(message, i);
            ObjectMapper mapper = new ObjectMapper();
            String jsonStr = "";
            try {
                jsonStr = mapper.writeValueAsString(msg);
            } catch (Exception e) {
                e.printStackTrace();
            }
            kafkaTemplate.send(TOPIC_NAME, jsonStr);
        }

        return NUM_MESSAGE+" messages sent" ;
    }
}
