package com.casual.home.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomeController {

	@RequestMapping("/hello")
	public String home() {
		return "hello world";
	}
	
	@RequestMapping("insert")
	public String insert(){
		
		
		return "insert";
	}
	
	@RequestMapping("update")
	public String update(){
		
		
		return "update";
	}
	
	@RequestMapping("delete")
	public String delete(){
		
		return "delete";
	}
	
	@RequestMapping("select")
	public String select(){
		
		return "select";
	}
	
	
}
