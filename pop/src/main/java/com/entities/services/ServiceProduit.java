/**
 * 
 */
package com.entities.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Categorie;
import com.entities.Produit;
import com.entities.dao.CatRepo;
import com.entities.dao.ProduitRepo;

/**
 * @author moi
 *
 */
public class ServiceProduit implements IserviceCat{

	@Autowired
	CatRepo crepo;
	
	
	@Autowired
	ProduitRepo prepo;
	
	
	public void AddCategorie(Categorie c)
	{
		crepo.save(c);
	}
	
	public Categorie findcat(Long id)
	{
		return crepo.findOne(id);
	}
	
	public List<Categorie> finall()
	{
		return crepo.findAll();
	}
	public List<Categorie> findByLibelle(String lib)
	{
		return crepo.findByLibelle(lib);
	}
	
	public void addproduit(Produit p, Long idc)
	{
		Categorie c = crepo.findOne(idc);
		p.setCategorie(c);
		prepo.save(p);
	}
	public List<Produit> all4Produitcat(Long idc)
	{
		 return crepo.findOne(idc).getProduits();
	}
	
	public Produit findproduitById(Long id)
	{
		return prepo.findOne(id);
	}

	@Override
	public void deletecat(Long id) {
		// TODO Auto-generated method stub
		crepo.delete(id);
	}
}
