package com.automationTaskn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationNController {
	@GetMapping
	public String get() {
		return "Hi";
	}

}
