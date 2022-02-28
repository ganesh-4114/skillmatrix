package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {
	@Autowired

	private UserRepository repo;

	//@RequestMapping(value = "/", method = RequestMethod.GET)
	@GetMapping("/")
	public String getHomepage() {
		return "home.html";

	}
	@GetMapping("/login.html")
	public String getLoginpage() {
		return "login.html";

	}
	//@RequestMapping(value = "/reg", method = RequestMethod.GET)
	@GetMapping("/register")
	public String showeRegistrationForm(Model model) {
		model.addAttribute("user", new Register());
		return "reg.html";
	}
	@PostMapping("/reg_sucesses")
	public String processRegForm(Register user) {
		repo.save(user);
		return "reg_sucesses.html";
	}

	//	 @RequestMapping("/reg_sucesses")
	//	    public String getsucess() {
	//	        return "reg_sucesses.html";

	//	    }


}