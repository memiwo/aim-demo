package com.aim;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired; 	
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = AimDemoApplication.class)
public class AimDemoApplicationTests {
	
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testGreetingDefault() {
		this.restTemplate.
		getForEntity("/greetings",String.class).
		getBody().
		contentEquals("Hello jjj,");
	}

}
