package com.kat.restkafkaproducer.service;

import com.kat.restkafkaproducer.config.TopicsProperties;
import com.kat.restkafkaproducer.model.ExampleResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducerService {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final TopicsProperties topicsProperties;

    public ExampleResponse publishMessage(String key, String value) {
        String exampleTopic = topicsProperties.getExampleTopic();
        log.info("Received {}, {}. Sending message to topic {}", key, value, exampleTopic);
        kafkaTemplate.send(exampleTopic, key, value);
        return ExampleResponse.builder()
                .key(key)
                .value(value)
                .topic(exampleTopic)
                .build();
    }
}
