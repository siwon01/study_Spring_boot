package com.daelim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequestMapping(value = "/api")
@Controller
public class MyController {
	
	@GetMapping("/test01")
	public String test01() {
		return "index";
	}
	
	@GetMapping("/test02")
	public String test02(@RequestParam(value="name", defaultValue="시원") String name) {
		System.out.println(name);
		return "index";
	}
	
	@GetMapping("/test03")
	public String test03(@RequestParam (value="name", defaultValue="시원")String name, 
			@RequestParam (value="age", defaultValue="22")String age) {
		System.out.println("이름 : " + name + ", 나이 : " + age);
		return "index";
	}
	
	

}
