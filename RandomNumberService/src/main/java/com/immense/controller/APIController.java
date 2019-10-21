package com.immense.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.immense.service.IRandomNumberService;

@RestController
@RequestMapping("/api")
public class APIController {

	@Autowired
	private IRandomNumberService randomNumberService;

	@GetMapping("/generate")
	public int generateRandomNumber() {
		return randomNumberService.generateRandomNumber();
	}
}
