package com.practice.kafka.consumer.client;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics="sql-delete")
	public void consumeMsg(String msg) {
		System.out.println(msg);
	}
}
