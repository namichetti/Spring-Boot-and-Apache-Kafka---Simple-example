package com.app.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.app.springboot.util.Constants.topicName;
import static com.app.springboot.util.Constants.topicNameJson;

@Configuration
public class KafkaTopicConfig {

    // Topic con mensaje en String
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(topicName)
               // .partitions(10) Puedo especificar pero voy a usar las particiones por defecto
                .build();

    }

    // Topic con mensaje en JSON
    @Bean
    public NewTopic jsonTopic(){
        return TopicBuilder.name(topicNameJson)
                .build();

    }
}
