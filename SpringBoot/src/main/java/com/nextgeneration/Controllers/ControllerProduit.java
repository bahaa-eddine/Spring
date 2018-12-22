package com.nextgeneration.Controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nextgeneration.Entites.Produit;
import com.nextgeneration.Services.ProduitService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerProduit {
	
	@Autowired
    ProduitService produitService;
    Produit produit;

    
    @GetMapping("/produits")
    public Collection<Produit> coolClients() {
    	Collection<Produit> produits = new ArrayList<>();
    	for(Produit c : produitService.getAllProduit()) {
    		produits.add(c);
    	}
        return produits;
    }
    
    @GetMapping("/produit={id}")
    public Produit getProduit(@PathVariable("id") final int id ) {
        return produitService.getProduitById(id);
    }

}
