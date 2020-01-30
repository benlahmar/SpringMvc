/**
 * 
 */
package com.entities.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entities.Categorie;

/**
 * @author moi
 *
 */
@Repository
public class CategorieManager implements IDao<Categorie, Long>{

	
	/**
	 * @return the hibernateTemplate
	 */
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	/**
	 * @param hibernateTemplate the hibernateTemplate to set
	 */
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	HibernateTemplate hibernateTemplate;
	
	
	@Override
	@Transactional
	public void store(Categorie t) {
		hibernateTemplate.save(t)	;	
	}

	@Override
	public Categorie findById(Long k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> all() {
		// TODO Auto-generated method stub
		return null;
	}

}
