package com.moi.gr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.entities.services.ServiceProduit;

@Controller
public class CategorieController {
	@Autowired
	ServiceProduit service;
	
	@RequestMapping(value="deletecat/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable Long id){    
		service.deletecat(id);    
        return "redirect:/";    
    }     
	  
}
