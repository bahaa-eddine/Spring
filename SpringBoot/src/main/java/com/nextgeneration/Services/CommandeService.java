package com.nextgeneration.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nextgeneration.Entites.Commande;
import com.nextgeneration.Repositories.CommandeRepository;

@Service
public class CommandeService {
	
	@Autowired
    private CommandeRepository commandeRepository;
	
	public void saveCommande(Commande commande) {
		commandeRepository.save(commande);
	}
	
	public void deleteCommandeById(int id) {
		commandeRepository.deleteById(id);
	}
	
	public Iterable<Commande> getAllCommande(){
		return commandeRepository.findAll();
	}
	
	public Commande getCommandeById(int id) {
		Optional<Commande> commande = commandeRepository.findById(id);
		return commande.get();
	}
	
	public void updateCommande(int id,Commande commande) {
		Commande commande1 = commandeRepository.findById(id).get();
		commande1.setDateCommande(commande.getDateCommande());
		commandeRepository.save(commande1);
	}

}
