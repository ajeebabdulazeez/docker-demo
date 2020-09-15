package com.learn.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ajeeb Abdul Azeez
 */
@RestController
public class TestController
{

	@GetMapping("/hello")
	public String hello()
	{
		return "Hi from controller";
	}
}
