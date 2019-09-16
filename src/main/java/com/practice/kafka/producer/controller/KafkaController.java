package com.practice.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.kafka.producer.client.Producer;

@RestController
public class KafkaController {

	@Autowired
	Producer producer;

	@RequestMapping(value = "/postMsg", consumes = "text/plain", method = { RequestMethod.POST })
	public void postMessage(@RequestBody String msg) throws Exception {
		producer.postMsg(msg);
	}
}
