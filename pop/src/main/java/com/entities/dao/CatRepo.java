package com.entities.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Categorie;

public interface CatRepo extends JpaRepository<Categorie, Long>{

	public List<Categorie> findByLibelle(String lib);
}
