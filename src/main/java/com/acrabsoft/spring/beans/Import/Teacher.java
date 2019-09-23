package com.acrabsoft.spring.beans.Import;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import com.acrabsoft.spring.beans.DataConfig;


public class Teacher {
	private String name;
	
	@Autowired
	private Student s;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}
	
	
}
