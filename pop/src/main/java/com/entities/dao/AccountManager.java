/**
 * 
 */
package com.entities.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entities.Account;

/**
 * @author moi
 *
 */
public class AccountManager implements IDao<Account, Long>{

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
	public void store(Account t) {
		Session ses = sf.openSession();
		ses.beginTransaction();
		ses.save(t);
		ses.getTransaction().commit();
		ses.close();
		
	}

	@Override
	public Account findById(Long k) {
		
		Session ses = sf.openSession();
		ses.beginTransaction();
		Account ac = (Account) ses.get(Account.class, k);
		ses.getTransaction().commit();
		ses.close();
		
		
		return ac;
	}

	@Override
	public List<Account> all() {
		
		Session ses = sf.openSession();
		ses.beginTransaction();
		List ls = ses.createQuery("from Account ").list();
		ses.getTransaction().commit();
		ses.close();
		return ls;
	}
	
}
