package com.kat.restkafkaproducer.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExampleResponse {
    private String key;
    private String value;
    private String topic;
}
