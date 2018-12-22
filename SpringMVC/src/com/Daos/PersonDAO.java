package com.Daos;

import java.util.List;

import com.Entites.Person;

public interface PersonDAO {
	
	public void insert(Person p);
	public void deleteById(int id);
	public void update(Person p);
	public List<Person> getAll();
	public Person getById(int id);

}
