package com.eduin.creditscore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.eduin.creditscore.model.CreditScore;
import com.eduin.creditscore.repos.CreditScoreRepo;

@RestController
public class CreditScoreController {
	
	@Autowired
	CreditScoreRepo repo;
	
	@GetMapping("/creditscores/{ssn}")
	public CreditScore getCreditScore(@PathVariable("ssn")String ssn) {
		return repo.findById(ssn).get();
	}


}
