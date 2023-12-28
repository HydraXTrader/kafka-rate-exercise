package com.example.kafkarate;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class KafkaConsumer {

  private static final String TOPIC_NAME = "my-topic";

  @KafkaListener(topics = TOPIC_NAME, groupId = "my-group")
  public void consumeMessage(String message) {

    // parse message in json string to object
    ObjectMapper mapper = new ObjectMapper();
    MessageDto msg = null;
    try {
      msg = mapper.readValue(message, MessageDto.class);
    } catch (Exception e) {
      e.printStackTrace();
    }
    // log out the message
    System.out.println(new Date() + " - Consumed message: " + msg.toString());
  }
}
