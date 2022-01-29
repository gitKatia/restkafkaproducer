package com.kat.restkafkaproducer.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExampleRequest {
    private String key;
    private String value;
}
