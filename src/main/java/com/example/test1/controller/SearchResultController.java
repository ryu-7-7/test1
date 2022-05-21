package com.example.test1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchResultController {
	
	@GetMapping("/search-rresult") 
	public String searchMedia(Model model, @RequestParam String fruit) {
		model.addAttribute("fruit", fruit);
		
		return "SearchResult";
	}
}