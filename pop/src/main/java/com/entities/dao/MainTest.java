package com.entities.dao;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entities.Categorie;
import com.entities.Commande;
import com.entities.services.IserviceCat;
import com.entities.services.IserviceCommande;
import com.entities.services.ServiceCommande;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext ctx2=new ClassPathXmlApplicationContext("Beans.xml");

		IserviceCat	pm= (IserviceCat) ctx2.getBean("add4Proxy");
		Categorie c=new Categorie();
		c.setLibelle("alphax");
		//pm.AddCategorie(c);
		
		IserviceCommande ss=(IserviceCommande) ctx2.getBean("Servicecommande");
		Commande cmd=new Commande();
		cmd.setDate(LocalDate.now());
		ss.addCommande(cmd, 1L);
	}

}
