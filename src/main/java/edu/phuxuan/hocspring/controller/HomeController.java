package edu.phuxuan.hocspring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.phuxuan.hocspring.model.User;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		User user = new User();
		user.setFullName("Lê Anh Vũ");
		user.setBirth("15/09/1994");
		user.setPhone("0772455326");
		user.setAddress("Vỹ Dạ, Huế");
		model.addAttribute("myuser",user);
		return "hello";
	}
	
	
}
