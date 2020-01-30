package com.entities.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entities.Account;
import com.entities.Profile;

public class ProfileManager implements IDao<Profile, Long>{

	SessionFactory sf;
	
	/**
	 * @return the sf
	 */
	public SessionFactory getSf() {
		return sf;
	}

	/**
	 * @param sf the sf to set
	 */
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void store(Profile t) {
		Session ses = sf.openSession();
		ses.beginTransaction();
		ses.save(t);
		ses.getTransaction().commit();
		ses.close();
	}

	@Override
	public Profile findById(Long k) {
		Session ses = sf.openSession();
		ses.beginTransaction();
		Profile ac = (Profile) ses.get(Profile.class, k);
		ses.getTransaction().commit();
		ses.close();
		
		
		return ac;
	}

	@Override
	public List<Profile> all() {
		Session ses = sf.openSession();
		ses.beginTransaction();
		List ls = ses.createQuery("from Profile ").list();
		ses.getTransaction().commit();
		ses.close();
		return ls;
	}

}
