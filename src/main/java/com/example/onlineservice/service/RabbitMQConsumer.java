package com.example.onlineservice.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.onlineservice.model.Employee;

@Component
public class RabbitMQConsumer {
	@RabbitListener(queues = "${onlineservice.rabbitmq.queue}")
	public void recievedMessage(Employee employee) {
		System.out.println("Recieved Message From RabbitMQ: " + employee);
	}
}
