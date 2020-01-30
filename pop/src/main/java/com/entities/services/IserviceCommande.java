/**
 * 
 */
package com.entities.services;

import java.time.LocalDate;
import java.util.List;

import com.entities.Commande;
import com.entities.Composant;
import com.entities.Produit;

/**
 * @author moi
 *
 */
public interface IserviceCommande {

	public Commande addCommande(Commande cmd, Long idac);
	public Commande AddProduit2Command(Long idp, Long idcmd, double prix, int qte);
	public Produit addProduit(Produit p);
	public Composant AddProduit2Command(Composant c);
	
	public Commande findById(Long id);
	public List<Commande> findByDate(LocalDate d1, LocalDate d2);
	public List<Commande> findByAccount(Long idac);
	
	
}
