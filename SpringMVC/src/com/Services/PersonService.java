package com.Services;

import java.util.List;

import com.Entites.Person;

public interface PersonService {
	
	public void insert(Person p);
	public void deleteById(int id);
	public void update(Person p);
	public List<Person> getAll();
	public Person getById(int id);

}
