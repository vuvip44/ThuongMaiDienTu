package com.example.TMDT.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	@RequestMapping("/admin1")
	public String admin() {
		return "admin/index";
	}
}
