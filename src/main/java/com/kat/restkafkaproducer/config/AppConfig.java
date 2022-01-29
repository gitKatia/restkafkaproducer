package com.kat.restkafkaproducer.config;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@RequiredArgsConstructor
public class AppConfig {
    private final TopicsProperties topicsProperties;

    // Not a best practice to create topics programmatically but useful during development
    @Bean
    public NewTopic exampleTopic() {
        return TopicBuilder.name(topicsProperties.getExampleTopic())
                .partitions(topicsProperties.getExampleTopicPartitions())
                .replicas(topicsProperties.getExampleTopicReplicas())
                .build();
    }
}
