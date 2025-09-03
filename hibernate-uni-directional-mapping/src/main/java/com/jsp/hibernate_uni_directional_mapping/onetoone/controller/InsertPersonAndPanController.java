package com.jsp.hibernate_uni_directional_mapping.onetoone.controller;

import java.time.LocalDate;

import com.jsp.hibernate_uni_directional_mapping.onetoone.dao.PersonPanDao;
import com.jsp.hibernate_uni_directional_mapping.onetoone.entity.Pan;
import com.jsp.hibernate_uni_directional_mapping.onetoone.entity.Person;

public class InsertPersonAndPanController {

	public static void main(String[] args) {
		
		PersonPanDao personPanDao = new PersonPanDao();
		
		Pan pan = new Pan();
		
		pan.setNumber("78REWQ@");
		pan.setAddress("noida sector 14");
		pan.setDob(LocalDate.parse("1988-10-10"));
		
		Person person = new Person();
		
		person.setId(665544);
		person.setName("Mohit");
		person.setEmail("mohit@yahoo.in");
		person.setPan(pan);
		
		Person person2=personPanDao.savePersonPanDao(person, pan);
		
		
	}
}
