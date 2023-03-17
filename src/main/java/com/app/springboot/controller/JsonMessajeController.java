package com.app.springboot.controller;

import com.app.springboot.kafka.JsonKafkaProducer;
import com.app.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessajeController {

    @Autowired
    private JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Mensaje JSON enviado al topic de kafka");
    }
}
