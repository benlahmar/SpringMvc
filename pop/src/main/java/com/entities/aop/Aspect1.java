/**
 * 
 */
package com.entities.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.entities.Commande;

/**
 * @author moi
 *
 */

@Aspect
public class Aspect1 {

	int i=0;
	@Before("execution(* *.addCommande(..))")
	public void klk(JoinPoint jp)
	{
		i++;
		System.out.println(i+"********debut de la méthode"
				+ "****"+jp.getSignature().getName());
	}
	
	@After("execution(* *.addCommande(..))")
	public void klk2(JoinPoint jp)
	{
		i++;
	System.out.println(i+"********fin de la méthode****"+
		jp.getSignature().getName());
	}
	@AfterReturning(pointcut = "execution(* *.addCommande(..))",
			returning = "res")
	public void klk3(JoinPoint jp, Commande res)
	{
		System.out.println("la méthode "+
	jp.getSignature().toLongString());
		System.out.println(res.toString());
	}
}
