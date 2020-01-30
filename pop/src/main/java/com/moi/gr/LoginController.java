/**
 * 
 */
package com.moi.gr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.entities.Account;
import com.entities.services.ServiceAccount;




/**
 * @author moi
 *
 */
@Controller
public class LoginController {
	@Autowired
	ServiceAccount userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("login");
	   // mav.addObject("login", new Login());

	    return mav;
	  }
	
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response
	      ) {
	    ModelAndView mav = null;
	    String log = request.getParameter("log");
	    String pass = request.getParameter("pass");
	    Account user = userService.sigin(log, pass);

	    if (null != user) {
	      mav = new ModelAndView("welcome");
	      mav.addObject("firstname", user.getLogin());
	    } else {
	      mav = new ModelAndView("login");
	      mav.addObject("message", "Username or Password is wrong!!");
	    }

	    return mav;
	  }
}
