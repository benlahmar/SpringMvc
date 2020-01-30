package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Composant {
	
	@Id
	@GeneratedValue
	Long idc;
	int quantite;
	double prixvente;
	
	@ManyToOne
	Produit produit;
	@ManyToOne
	Commande commande;
	/**
	 * @return the idc
	 */
	public Long getIdc() {
		return idc;
	}
	/**
	 * @param idc the idc to set
	 */
	public void setIdc(Long idc) {
		this.idc = idc;
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
	 * @return the prixvente
	 */
	public double getPrixvente() {
		return prixvente;
	}
	/**
	 * @param prixvente the prixvente to set
	 */
	public void setPrixvente(double prixvente) {
		this.prixvente = prixvente;
	}
	/**
	 * @return the produit
	 */
	public Produit getProduit() {
		return produit;
	}
	/**
	 * @param produit the produit to set
	 */
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	/**
	 * @return the commande
	 */
	public Commande getCommande() {
		return commande;
	}
	/**
	 * @param commande the commande to set
	 */
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
}
