package com.udemy.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.udemy.model.Person;
import com.udemy.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl  implements ExampleService{

	 private static final Log LOG= LogFactory.getLog(ExampleServiceImpl.class);
	@Override
	public List<Person> getListPeople() {
	 
		
		{
			List<Person> people = new ArrayList<>();
			people.add(new Person("persona uno",1));
			people.add(new Person("persona dos",2));
			people.add(new Person("persona tres",3));
			people.add(new Person("persona cuatro",4));
              LOG.info("hola soy el servicio");
			return people;


			
			}
	
	}

}
