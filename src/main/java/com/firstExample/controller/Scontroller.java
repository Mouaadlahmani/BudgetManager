package com.firstExample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Scontroller {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	//@ResponseBody
	public String hello() {
		return "index";
	}
}
