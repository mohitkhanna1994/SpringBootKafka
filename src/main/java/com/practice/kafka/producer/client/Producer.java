package com.practice.kafka.producer.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	@Autowired
	private KafkaTemplate<String, String> template;
	private static final String TOPIC = "sql-delete";

	public void postMsg(String msg) {
		this.template.send(TOPIC,msg);
	}
}
