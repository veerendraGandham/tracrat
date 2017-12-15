package com.mk.tracrat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.mk.tracrat.service.UserInsertService;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "home";
	}
}
