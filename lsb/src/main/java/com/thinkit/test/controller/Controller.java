package com.thinkit.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.tools.classfile.Opcode.Set;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String home() {
		return "index.html";
	}
	
}
