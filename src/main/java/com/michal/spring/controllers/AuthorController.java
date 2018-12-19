package com.michal.spring.controllers;

import com.michal.spring.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Michal Cwiekala on 2018-12-19.
 */
@Controller
public class AuthorController {
	
	private AuthorRepository authorRepository;
	
	public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}
	
	@RequestMapping("/authors")
	public String getBooks(Model model){
		model.addAttribute("authors", authorRepository.findAll());
		return "authors";
	}
	
}
