package com.Daos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entites.Person;

public class ImpPersonDAO implements PersonDAO{

	@Override
	public void insert(Person p) {
		SessionFactory sessionFactory = new  Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(p);
		transaction.commit();
	}

	@Override
	public void deleteById(int id) {
		SessionFactory sessionFactory = new  Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Person p = (Person) session.load(Person.class, id);
		session.delete(p);
		transaction.commit();
	}

	@Override
	public void update(Person p) {
		SessionFactory sessionFactory = new  Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Person person = (Person) session.load(Person.class, p.getId());
		person.setFirstName(p.getFirstName());
		person.setLastName(p.getLastName());
		person.setAge(p.getAge());
		person.setCity(p.getCity());
		session.persist(person);
		transaction.commit();
	}

	@Override
	public List<Person> getAll() {
		SessionFactory sessionFactory = new  Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query q = session.createQuery("from Person");
		return q.list();
	}

	@Override
	public Person getById(int id) {
		SessionFactory sessionFactory = new  Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Person p = (Person) session.load(Person.class, id);
		return p;
	}
	
	public void init() {
		System.out.println("Initialization ...");
	}

}
