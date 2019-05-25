package com.example.demo.controller;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class PageController {
	@RequestMapping("/")
	public String index(){
		return "hello";
	}
	/*@RequestMapping("/hello2")
	public String hello2(@RequestParam(value="name") String name,Model model) {
	model.addAttribute("name", name);
	return "hello2";
	}*/
@RequestMapping("/aboutme")
public String me() {
	return "hello2";
}
@RequestMapping("/message")
public String pesan() {
	return "calcu";
}
}
