package com.springboot.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
 
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	@RequestMapping("/helloworld")
	public ModelAndView hello() {
 
	
		
		String helloWorldMessage = "Hello world from springboot!";
		return new ModelAndView("hello", "message", helloWorldMessage);
	}
}
