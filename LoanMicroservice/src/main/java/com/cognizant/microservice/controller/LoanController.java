package com.cognizant.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoanController {
	
	@GetMapping("/{number}")
	public String getLoanByNumber(@PathVariable Integer number)
	{
		String responseJson = "{ number: \"P1234ABC\", type: \"Bike\", loan: 3048, emi: 258, tenure: 8 }";
		return responseJson;
	}
}
