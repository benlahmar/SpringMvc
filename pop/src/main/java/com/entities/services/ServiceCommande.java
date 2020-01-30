package com.entities.services;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Account;
import com.entities.Commande;
import com.entities.Composant;
import com.entities.Produit;
import com.entities.dao.AccountRepo;
import com.entities.dao.CommandeRepo;
import com.entities.dao.ComposantRepo;
import com.entities.dao.ProduitRepo;

@Service
public class ServiceCommande implements IserviceCommande {

	@Autowired
	CommandeRepo comandrepo;
	@Autowired
	ComposantRepo composantrepo;
	@Autowired
	AccountRepo accRepo;
	@Autowired
	ProduitRepo prdRepo;
	
	@Override
	public Commande addCommande(Commande cmd, Long idac) {
		Account acc = accRepo.findOne(idac);
		cmd.setAccount(acc);
		 return comandrepo.save(cmd);
	}

	@Override
	public Commande AddProduit2Command(Long idp, Long idcmd,double prix, int qte) {
			Composant c=new Composant();
			Produit p = prdRepo.findOne(idp);
			Commande cm = comandrepo.findOne(idcmd);
			c.setCommande(cm);
			c.setProduit(p);
			c.setPrixvente(prix);
			c.setQuantite(qte);
			composantrepo.save(c);
			
		return cm;
	}

	@Override
	public Composant AddProduit2Command(Composant c) {
		// TODO Auto-generated method stub
		return composantrepo.save(c);
	}

	@Override
	public Commande findById(Long id) {
		// TODO Auto-generated method stub
		return comandrepo.findOne(id);
	}

	@Override
	public List<Commande> findByDate(LocalDate d1, LocalDate d2) {
		// TODO Auto-generated method stub
		
		//comandrepo.findAll().stream().filter(x->x.getDate().isAfter(d1) && x.getDate().isBefore(d2)).collect(Collectors.toList());
		return comandrepo.findByDateBetween(d1, d2);
	}

	@Override
	public List<Commande> findByAccount(Long idac) {
		// TODO Auto-generated method stub
		return comandrepo.findByAccountId(idac);
	}

	@Override
	public Produit addProduit(Produit p) {
		// TODO Auto-generated method stub
		return prdRepo.saveAndFlush(p);
	}

}
