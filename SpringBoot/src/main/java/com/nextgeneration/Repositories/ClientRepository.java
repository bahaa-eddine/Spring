package com.nextgeneration.Repositories;

import com.nextgeneration.Entites.Client;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface ClientRepository extends CrudRepository<Client, Integer> {

}
