package com.nextgeneration.Entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
    @Column
	private String dateCommande;
    @ManyToOne
    private Client client;
    @ManyToMany
    private List<Produit> produits;
    @OneToMany
    private List<Facture> factures;
    @OneToMany
    private List<Livraison> livraisons;
        
    public Commande() {
    	
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(String dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public List<Facture> getFactures() {
		return factures;
	}

	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}

	public List<Livraison> getLivraisons() {
		return livraisons;
	}

	public void setLivraisons(List<Livraison> livraisons) {
		this.livraisons = livraisons;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", dateCommande=" + dateCommande + ", client=" + client + ", produits=" + produits
				+ ", factures=" + factures + ", livraisons=" + livraisons + "]";
	}

	
	
}
