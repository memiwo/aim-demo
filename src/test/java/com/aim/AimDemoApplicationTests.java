package com.aim;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired; 	
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AimDemoApplicationTests {
	
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testGreetingDefault() {
		ResponseEntity<String> response = this.restTemplate.getForEntity("/greetings",String.class);
		assertEquals("Hello, ", response.getBody());
	}
	
	@Test
	public void testGreetingWithNameAndDefaultLocale(){
		ResponseEntity<String> response = this.restTemplate.getForEntity("/greetings?name=John", String.class);
		assertEquals("Hello, John", response.getBody());
	}
	
	
	@Test
	public void testGreetingWithNameAndLocale(){
		ResponseEntity<String> response = this.restTemplate.getForEntity("/greetings?lang=es&name=Clare", String.class);
		
		assertEquals("Hola, Clare", response.getBody());
	}

}
