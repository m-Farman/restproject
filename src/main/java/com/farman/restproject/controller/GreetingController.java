package com.farman.restproject.controller;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farman.restproject.beans.Greeting;

@RestController
@RequestMapping("v1")
public class GreetingController {

	private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public com.farman.restproject.beans.Greeting getGreeting(@RequestParam(value = "name", defaultValue = "Farman") String name) {
		final String[] greets = { "Hello !", "Hey ,", "You Bitch ;)", "Great ", "Highness " };
		return new Greeting(counter.incrementAndGet(), greets[ThreadLocalRandom.current().nextInt(0, 4)] + " " + name);
	}

	
	
}
