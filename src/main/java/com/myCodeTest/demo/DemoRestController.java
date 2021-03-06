package com.myCodeTest.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DemoRestController implements ErrorController{
	
	@Autowired
	private StringService stringService;

	private static final String PATH = "/error";

	@RequestMapping(value = PATH)
	public String error() {
		return "Error handling";
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}

	@RequestMapping("/")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}

	
	@RequestMapping(value = "/reverseString" , method= RequestMethod.POST)
	public String reverseString(@RequestParam("name") String name){
		return stringService.caseReversal(name);
	}

}
