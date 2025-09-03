package com.jsp.hibernate_uni_directional_mapping.onetoone.dao;

import com.jsp.hibernate_uni_directional_mapping.onetoone.entity.Pan;
import com.jsp.hibernate_uni_directional_mapping.onetoone.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PersonPanDao {

	EntityManager em = Persistence.createEntityManagerFactory("hibernate-uni-directional").createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Person savePersonPanDao(Person person,Pan pan) {
		
		try {
			
			et.begin();
			
			em.persist(pan);
			em.persist(person);
			
			et.commit();
			
			return person;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
