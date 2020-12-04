package com.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.curator.framework.CuratorFramework;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class Application implements ApplicationListener<ApplicationReadyEvent> {

	private final Environment environment;

	@Value("${spring.application.name}")
	private String applicationName;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {

		log.info("Application name is: {}", applicationName);

		final String someKey = "someKey";
		final String otherKey = "otherKey";

		log.info("Reading property: {} = {}", someKey, environment.getProperty(someKey));
		log.info("Reading property: {} = {}", otherKey, environment.getProperty(otherKey));
	}
}
