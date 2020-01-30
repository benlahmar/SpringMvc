package com.entities.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entities.Categorie;

@Repository
public class Bbbb {

	@Autowired
	CatRepo crepo;
	public void add(Categorie c)
	{
		crepo.save(c);
		
	}
}
