package com.timposu.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timposu.Person;

@Service("personService")
@Transactional
public class PersonService {
	
	@Autowired SessionFactory sessionFactory;
	
	public List<Person> getAll(){
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM Person").list();
	}
	
	public Person get(Integer id){
		return (Person) sessionFactory.getCurrentSession().get(Person.class, id);
	}
	
	public void add(Person p){
		sessionFactory.getCurrentSession().save(p);
	}
	
	public void delete(Integer id){
		sessionFactory.getCurrentSession().delete(id);
	}
	
	public void edit(Person person){
		Person exitingPerson = (Person) sessionFactory.getCurrentSession().
				get(Person.class, person.getId());
		exitingPerson.setFirstName(person.getFirstName());
		exitingPerson.setLastName(person.getLastName());
		exitingPerson.setMoney(person.getMoney());
		
		sessionFactory.getCurrentSession().save(exitingPerson);
	}
}
