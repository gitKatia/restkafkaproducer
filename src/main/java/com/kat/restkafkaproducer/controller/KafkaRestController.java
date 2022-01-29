package com.kat.restkafkaproducer.controller;

import com.kat.restkafkaproducer.model.ExampleRequest;
import com.kat.restkafkaproducer.model.ExampleResponse;
import com.kat.restkafkaproducer.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaRestController {
    private final KafkaProducerService kafkaProducerService;

    @PostMapping(value = "examples")
    public ResponseEntity<ExampleResponse> sendRequest(@RequestBody ExampleRequest request) {
        // Request should be validated
        ExampleResponse exampleResponse = kafkaProducerService.publishMessage(request.getKey(), request.getValue());
        return ResponseEntity.ok(exampleResponse);
    }
}
