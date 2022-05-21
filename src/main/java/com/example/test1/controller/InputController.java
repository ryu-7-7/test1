package com.example.test1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.test1.Test1Form;



@Controller
public class InputController {
	
	@GetMapping("/search-input")
	public String getMediaList1(Model model, @ModelAttribute Test1Form form) {

	return "searchInput";
}

@PostMapping("/search-input")
	public String getMediaList(Model model, @ModelAttribute Test1Form form) {

	return "searchResult";
}
}