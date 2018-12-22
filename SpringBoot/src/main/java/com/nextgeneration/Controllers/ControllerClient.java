package com.nextgeneration.Controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nextgeneration.Entites.Client;
import com.nextgeneration.Services.ClientService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerClient {
	
	@Autowired
    ClientService clientService;
    Client client;

    
    @GetMapping("/clients")
    public Collection<Client> coolClients() {
    	Collection<Client> clients = new ArrayList<>();
    	for(Client c : clientService.getAllClient()) {
    		clients.add(c);
    	}
        return clients;
    }
    
    @GetMapping("/client={id}")
    public Client getClient(@PathVariable("id") final int id ) {
        return clientService.getClientById(id);
    }
    
    @GetMapping("/deleteclient={id}")
    public void deleteClient(@PathVariable("id") final int id ) {
        clientService.deleteClientById(id);
    }

}
