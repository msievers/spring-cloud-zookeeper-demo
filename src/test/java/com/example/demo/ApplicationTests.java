package com.example.demo;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationTests {

	@Autowired
	Environment environment;

	@Test
	void checkProperties() {

		final String someKey = "someKey";
		final String otherKey = "otherKey";

		assertThat(environment.getProperty(someKey)).isEqualTo("someValue");
		assertThat(environment.getProperty(otherKey)).isEqualTo("otherDefaultValue");
	}

}
