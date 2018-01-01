package com.netease.Spring_Web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.netease.Spring_Web.dao.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
	
	@Autowired
	private SpittleRepository spittleRepository; 
	
	@RequestMapping(method = RequestMethod.GET)
	public String spittles(Model model) {
		model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		return "spittles";
	}
	
}
