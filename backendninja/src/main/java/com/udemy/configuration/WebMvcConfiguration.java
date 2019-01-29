package com.udemy.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.udemy.component.RequestTimeInterceptor;
@EnableWebMvc

@Component


public class WebMvcConfiguration extends WebMvcConfigurerAdapter{
	
       @Autowired
       RequestTimeInterceptor requestTimeInterceptor;
       // RequestTimeInterceptor requestTimeInterceptor;
       
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	
		 registry.addInterceptor(requestTimeInterceptor);
	}
	

}
