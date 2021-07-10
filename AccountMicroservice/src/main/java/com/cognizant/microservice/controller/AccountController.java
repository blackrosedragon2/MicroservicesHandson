package com.cognizant.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@GetMapping("/{number}")
	public String getAccountByNumber(@PathVariable Integer number)
	{
		String responseJson = "{ number: \"P1234ABC\", type: \"savings\", balance: 234343}";

		return responseJson;
	}
}
