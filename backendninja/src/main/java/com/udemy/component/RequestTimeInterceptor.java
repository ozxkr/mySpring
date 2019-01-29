package com.udemy.component;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
@Component("requestTimeInterceptor")

public class RequestTimeInterceptor  extends HandlerInterceptorAdapter{
	private static final Log LOG = LogFactory.getLog(RequestTimeInterceptor.class);
       //primero
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		 System.out.println("a ver la ptm");


		request.setAttribute("starTime", System.currentTimeMillis());
	       LOG.info("hola");
		return true;
	}
	
//segundo
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		Long starTime = (Long) request.getAttribute("starTime");
	 	//LOG.info("--REQUEST URL:-'" + request.getRequestURL().toString() + "' --TOTAL TIME '"+ (System.currentTimeMillis() - starTime)+ "' ms" );
 	     LOG.info("hola syo 1");
	}
	
	 
	 public void sayHello()
	 {
		 LOG.info("compunente 2");
	 }


}
