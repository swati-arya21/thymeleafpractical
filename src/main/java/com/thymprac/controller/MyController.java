package com.thymprac.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String about(Model model)
	{
		System.out.println("Inside about method");
		model.addAttribute("name","Ravi Khevaria");
		model.addAttribute("currenttime", new Date().toLocaleString());
		return "about";
	}
	@GetMapping("/loop-example")
	public String iteratorHandler(Model model)
	{
		List<String> names = List.of("Ganesh","Kartikeya","Shiv","Parvati");
		model.addAttribute("names",names);
		return "iterator";
	}
	//HandlerFor Conditional Statement
	@GetMapping("/condition")
	public String conditionalHandler(Model m)
	{
		System.out.println("Conditional handler Executed");
		m.addAttribute("isActive", true);
		m.addAttribute("Gender","M");
		
		List<Integer> list = List.of(23,43,22,12,65,77,89,54);
		m.addAttribute("mylist", list);
		return "condition";
	}
	
	@GetMapping("/service")
	public String serviceHandler(Model m)
	{
		m.addAttribute("title","This is Dynamic Title");
		m.addAttribute("subtitle",LocalDateTime.now().toString());
		return "service";
	}
	@GetMapping("/newabout")
	public String newAbout()
	{
		return "aboutnew";
	}
	@GetMapping("/contact")
	public String contact()
	{
		return "contact";
	}
}
