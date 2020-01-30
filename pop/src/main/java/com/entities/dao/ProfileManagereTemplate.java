/**
 * 
 */
package com.entities.dao;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.entities.Profile;

/**
 * @author moi
 *
 */
public class ProfileManagereTemplate implements IDao<Profile, Long>{

	HibernateTemplate hibernateTemplate;

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

	@Override
	@Transactional
	public void store(Profile t) {
		hibernateTemplate.save(t);
	}

	@Override
	@Transactional(readOnly = true)
	public Profile findById(Long k) {
		Profile p = hibernateTemplate.get(Profile.class, k);
//		Profile ex=new Profile();
//		ex.setId(k);
//		Profile p = hibernateTemplate.findByExample(ex).get(0);
		return p;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Profile> all() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
