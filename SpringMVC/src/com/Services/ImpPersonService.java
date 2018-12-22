package com.Services;

import java.util.List;

import com.Daos.PersonDAO;
import com.Entites.Person;

public class ImpPersonService implements PersonService{
	
	private PersonDAO dao;

	@Override
	public void insert(Person p) {
		dao.insert(p);
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
	}

	@Override
	public void update(Person p) {
		dao.update(p);
	}

	@Override
	public List<Person> getAll() {
		return dao.getAll();
	}

	@Override
	public Person getById(int id) {
		return dao.getById(id);
	}

	public PersonDAO getDao() {
		return dao;
	}

	public void setDao(PersonDAO dao) {
		this.dao = dao;
	}

	
}
