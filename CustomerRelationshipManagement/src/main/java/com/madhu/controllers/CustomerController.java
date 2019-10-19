package com.madhu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	@RequestMapping("customers")
	public String customers() {
		
<<<<<<< HEAD
		return "customerslist.jsp";
=======
		return "customerslist";
>>>>>>> ef0e6dd... first jsp and project fixes
	}
}
