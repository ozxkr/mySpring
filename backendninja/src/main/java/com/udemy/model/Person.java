package com.udemy.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class Person {
	 @NonNull
	 @Size(min=2, max= 10)
	private String name;
	 @NonNull
	 @Min(18)
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person ()
	{}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
