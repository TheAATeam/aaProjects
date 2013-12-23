package com.secret.santa;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.secret.santa.dao.User;
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		model.addAttribute("user", new User());
		return "ss-index";
	}
	
	@RequestMapping(value="form", method=RequestMethod.GET)
	public String loadFormPage(Model m) {
		m.addAttribute("user", new User());
		return "formPage";
	}

}
