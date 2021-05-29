package com.vivek.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AccountResource {
	@GetMapping(value = "/status")
	public String GetAppStatus() {
		return "Vivek Java 1235555";
	}
	
	@GetMapping(value = "/error")
	public String HandleError() {
		return "Error";
	}
}
