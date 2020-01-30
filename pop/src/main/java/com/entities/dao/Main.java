package com.entities.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.entities.Account;
import com.entities.Categorie;
import com.entities.Profile;

public class Main {

	
	
	public static void main(String[] args) {
		
	//	ApplicationContext ctx=new ClassPathXmlApplicationContext("Appcontext.xml");
//		AccountManager cm=(AccountManager) ctx.getBean("adao");
//		Account a=new Account();
//		ProfileManager pm=(ProfileManager) ctx.getBean("pdao");
//		
		Profile p=new Profile();
		p.setNom("ali");
		p.setEmail("gg@pp");
		p.setPrenom("ss");
//		
		
//		pm.store(p);
//		
		
//		a.setLogin("xyz");
//		a.setProfile(p);
//		cm.store(a);
		
	//	IDao<Profile, Long> pmt= (IDao<Profile, Long>) ctx.getBean("profiletdao");
	//	pmt.store(p);
		
		
//		IDao<Categorie, Long> cdao=  (IDao<Categorie, Long>) ctx.getBean("cdao");
		Categorie c=new Categorie();
		c.setLibelle("azerty");
////		cdao.store(c);
//		//fin
		ApplicationContext ctx2=new ClassPathXmlApplicationContext("Beans.xml");
//
		Bbbb bb= (Bbbb) ctx2.getBean("bb");
//		CatRepo crep = ctx2.getBean(CatRepo.class);
//		//crep.save(c);
		bb.add(c);
		
	}

}
