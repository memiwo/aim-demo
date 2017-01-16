package com.aim.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.BDDMockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import com.aim.service.GreetingService;

@RunWith(SpringRunner.class)
@WebMvcTest(GreetingController.class)
public class GreetingControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private GreetingService greetingService;

	@Test
	public void testGreeting() throws Exception{
		given(this.greetingService.getMessage("Issa")).
		willReturn("Hello, Issa");
		
		this.mvc.
		perform(get("/greetings?name=Issa")).
		andExpect(status().isOk()).
		andExpect(content().string("Hello, Issa"));
	}
	
	@Test
	public void testGreetingWithLocale() throws Exception{
		given(this.greetingService.getMessage("Issa")).
		willReturn("Hola, Issa");
		
		this.mvc.
		perform(get("/greetings?name=Issa&lang=es")).
		andExpect(status().isOk()).
		andExpect(content().string("Hola, Issa"));
	}
}
