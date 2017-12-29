package com.netease.Spring_Web.controller;

import java.io.IOException;
import java.io.Writer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/", "/homepage"})
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String Spring() {
		return "home";
	}

	public void Home(Writer write) throws IOException {
		write.write("Hello World!!!");
	}
	
}
