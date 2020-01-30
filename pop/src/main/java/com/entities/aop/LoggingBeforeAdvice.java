/**
 * 
 */
package com.entities.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author moi
 *
 */
public class LoggingBeforeAdvice implements MethodBeforeAdvice {
	private Log log = LogFactory.getLog(this.getClass());

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("****************Méthode " + method.getName() + "() invoquée avec "
				+ Arrays.toString(args));
		
	}

}
