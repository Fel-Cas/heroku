package com.deploy.heroku;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class HerokuApplicationTests {

	@Test
	void contextLoads() {
		System.getenv().forEach(
				(key,value)-> System.out.println(key + " "+value)
		);
	}

}
