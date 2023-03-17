package com.app.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import static com.app.springboot.util.Constants.topicName;

@Service
public class KafkaConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = topicName, groupId="${spring.kafka.consumer.group-id}")
    public void consume(String message){
        LOG.info("Mensaje recibido-> "+message);
    }
}
