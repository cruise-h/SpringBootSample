package com.ibm.cruise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("home")
	public String home() {
		return "Hello Jenkins World!";
	}
	
}