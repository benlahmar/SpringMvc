/**
 * 
 */
package com.moi.gr;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.org.eclipse.jdt.core.compiler.CategorizedProblem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.entities.Categorie;
import com.entities.services.ServiceProduit;

/**
 * @author moi
 *
 */
@Controller
public class TestController {

	@Autowired
	ServiceProduit service;
	@RequestMapping("/cats")
	public String test1(Model md)
	{
		
		List<Categorie> cs = service.finall();
		md.addAttribute("cs", cs);
		return "cats";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id)
	{
		service.deletecat(id);
		return "redirect:/cats";
	}
	@RequestMapping("/addcat")
	public ModelAndView addcat()
	{
		ModelAndView mad=new ModelAndView("addcat");
		Categorie c=new Categorie();
		mad.addObject("cat",c);
		return mad;
	}
	
	@RequestMapping("/addcat/{id}")
	public ModelAndView addcat2(@PathVariable Long id)
	{
		Categorie c = service.findcat(id);
		ModelAndView mad=new ModelAndView("addcat");
		
		mad.addObject("cat",c);
		return mad;
	}
	
	@RequestMapping(value="addcat/catadd", method = RequestMethod.POST)
	public String add(HttpServletRequest req,HttpServletResponse resp, 
			@ModelAttribute("cat") Categorie c,BindingResult result, SessionStatus status )
	{
		System.out.println("*****");
		//ModelAndView mad=new ModelAndView("addcat");
		service.AddCategorie(c);
		return "redirect:/cats";
	}
	
	@RequestMapping("xyz")
	public String aaa(Model md)
	{
		List<Categorie> cs = service.finall();
		md.addAttribute("cs", cs);
		return "exemple";
	}
}
