/**
 * 
 */
package com.entities.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Commande;
import com.entities.Account;

/**
 * @author moi
 *
 */
public interface CommandeRepo extends JpaRepository<Commande, Long>{

	public List<Commande> findByDateBetween(LocalDate d1, LocalDate d2);
	public List<Commande> findByAccountId(Long id);
	
}
