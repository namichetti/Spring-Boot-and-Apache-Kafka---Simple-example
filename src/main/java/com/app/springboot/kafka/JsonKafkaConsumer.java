package com.app.springboot.kafka;

import com.app.springboot.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.app.springboot.util.Constants.topicNameJson;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = topicNameJson, groupId="${spring.kafka.consumer.group-id}")
    public void consume(User user){
        LOG.info("Mensaje recibido-> "+user.toString());
    }
}
