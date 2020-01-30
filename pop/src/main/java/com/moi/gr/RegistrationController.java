package com.moi.gr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.entities.Account;
import com.entities.Profile;
import com.entities.services.ServiceAccount;


@Controller
public class RegistrationController {
  @Autowired
	ServiceAccount userService;

  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("register");
    //mav.addObject("profile", new Profile());
    mav.addObject("user", new Account());

    return mav;
  }

  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("user") Account user,BindingResult result, SessionStatus status) {

	  
	  boolean error = false;
	     
	    System.out.println(user); //Verifying if information is same as input by user
	     
	    if(user.getLogin().isEmpty()){
	        result.rejectValue("login", "error.login");
	        error = true;
	    }
	    if(error) {
	    	new ModelAndView("register");
	    }
    Profile profile=user.getProfile();
	userService.addProfile(profile);
	userService.addAccount(user);
    return new ModelAndView("welcome", "firstname", profile.getNom()+" "+profile.getPrenom());
  }
}
