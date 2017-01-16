package com.aim.service;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

@Service
public class GreetingByLocaleService implements GreetingService {

	
	private MessageSource messageSource;
	
	public GreetingByLocaleService(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	@Override
	public String getMessage(String name) {

		return this.messageSource.getMessage("hello", new String[]{name}, LocaleContextHolder.getLocale());
	}

}
