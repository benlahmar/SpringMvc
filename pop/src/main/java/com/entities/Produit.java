/**
 * 
 */
package com.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * @author moi
 *
 */
@Entity
@NamedQuery(name = "Produit.abcd",query = "From Produit p where p.categorie.libelle=?1")
public class Produit {

	@Id
	@GeneratedValue
	Long id;
	String designation;
	double prix;
	int quantite;
	
	@ManyToOne
	Categorie categorie;
	
	@OneToMany(mappedBy = "produit")
	List<Composant> composants=new ArrayList<Composant>();

	/**
	 * @return the composants
	 */
	public List<Composant> getComposants() {
		return composants;
	}

	/**
	 * @param composants the composants to set
	 */
	public void setComposants(List<Composant> composants) {
		this.composants = composants;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * @return the quantite
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	/**
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
}
