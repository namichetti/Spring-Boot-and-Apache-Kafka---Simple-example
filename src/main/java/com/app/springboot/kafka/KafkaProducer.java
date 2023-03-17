package com.app.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import static com.app.springboot.util.Constants.topicName;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private static final Logger LOG = LoggerFactory.getLogger(KafkaProducer.class.getName());

    //para enviar mensaje al topic
    public void sendMessage(String message){
        LOG.info("Message enviado: " +message);
        this.kafkaTemplate.send(topicName,message);
    }

}
