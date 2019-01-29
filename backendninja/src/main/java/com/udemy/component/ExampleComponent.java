package com.udemy.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@SpringBootApplication
 @Component("exampleComponent")
 public class ExampleComponent {
 private static final Log LOG= LogFactory.getLog(ExampleComponent.class);
 
 public void sayHello()
 {
	 LOG.info("HELLO FROM EXAMPLECOMPONENT");

 }
}
