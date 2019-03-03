package com.abiewska.ski.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.abiewska.ski.model.Equipment;

@Controller
@RequestMapping("/equipment")
public class EquipmentController {
	
	@RequestMapping("/add")
   public ModelAndView add() {
		ModelAndView model= new ModelAndView("add");
		model.addObject("equipment", new Equipment());
		
	return model;
	   
   }
}
