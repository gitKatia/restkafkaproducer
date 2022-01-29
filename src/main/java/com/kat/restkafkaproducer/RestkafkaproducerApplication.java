package com.kat.restkafkaproducer;

import com.kat.restkafkaproducer.config.TopicsProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(TopicsProperties.class)
public class RestkafkaproducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestkafkaproducerApplication.class, args);
	}

}
