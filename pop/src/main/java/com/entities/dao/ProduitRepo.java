package com.entities.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entities.Produit;


public interface ProduitRepo extends JpaRepository<Produit, Long>{
  List<Produit> findByquantiteBetween(int q1,int q2);
  List<Produit> abcd(String libelle);
  
  @Query("from Produit p where p.prix>?1")
  public List<Produit> azerty(double prix);
}
