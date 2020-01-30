package com.entities.services;

import java.util.List;

import com.entities.Categorie;
import com.entities.Produit;

public interface IserviceCat {

	public void AddCategorie(Categorie c);
	
	
	public Categorie findcat(Long id);
	
	
	public List<Categorie> finall();
	
	public List<Categorie> findByLibelle(String lib);
	
	
	public void addproduit(Produit p, Long idc);
	
	public List<Produit> all4Produitcat(Long idc);
	
	
	public Produit findproduitById(Long id);
	
	public void deletecat(Long id);
}
