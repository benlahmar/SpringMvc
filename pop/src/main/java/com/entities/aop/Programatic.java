package com.entities.aop;

import org.springframework.aop.framework.ProxyFactoryBean;

import com.entities.Categorie;
import com.entities.services.ServiceProduit;

public class Programatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create target
		ServiceProduit b = new ServiceProduit();

				// create advice
				LoggingBeforeAdvice ls = new LoggingBeforeAdvice();

				// add target + advice to proxy
				ProxyFactoryBean proxy = new ProxyFactoryBean();
				proxy.setTarget(b);
				proxy.addAdvice(ls);

				// get generated proxy object
				ServiceProduit bproxy = (ServiceProduit) proxy.getObject();
				Categorie c=new Categorie();
				c.setLibelle("ff");
				bproxy.AddCategorie(c);
	}

}
