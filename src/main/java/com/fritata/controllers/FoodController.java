package com.fritata.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fritata.services.IFoodService;

@Controller()
public class FoodController {

	@Autowired
	private IFoodService serviceFood;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String list(Model model) {
		
		model.addAttribute("ingredientes", serviceFood.findAll());
		return "index";
	}
	
	@ModelAttribute("namefoods")
	public List<String> listFood(){
		
		return serviceFood.findAll().stream().map(item-> item.getFoodName()).collect(Collectors.toList());
			
	}
}
