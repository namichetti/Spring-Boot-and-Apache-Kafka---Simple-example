package com.app.springboot.kafka;

import com.app.springboot.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import static com.app.springboot.util.Constants.topicName;
import static com.app.springboot.util.Constants.topicNameJson;

@Service
public class JsonKafkaProducer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private static final Logger LOG = LoggerFactory.getLogger(JsonKafkaProducer.class);

    public void sendMessage(User user){

        LOG.info("Message enviado: " +user.toString());

        Message<User> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC,topicNameJson)
                .build();

        this.kafkaTemplate.send(message);
    }






}
