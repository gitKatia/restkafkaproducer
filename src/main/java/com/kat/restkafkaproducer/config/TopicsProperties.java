package com.kat.restkafkaproducer.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = TopicsProperties.TOPICS_PREFIX)
@Data
public class TopicsProperties {
    static final String TOPICS_PREFIX = "rest-kafka-producer";
    private String exampleTopic;
    private int exampleTopicReplicas;
    private int exampleTopicPartitions;
}
