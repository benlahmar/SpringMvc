/**
 * 
 */
package com.moi.gr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
		return "cats";
	}
}
