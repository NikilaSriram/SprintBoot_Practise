package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.ResponseBody;

//To create
@Controller
public class HelloController {
	/*
	@RequestMapping("home")// to map the request from controller to view
	//@ResponseBody // to print the output returned by the method but not the home.jsp page
	public String output(HttpServletRequest req)
	{
		//Can use session obj to take input from client
		HttpSession session = req.getSession(); //localhost:8080/home?name=nikki
		String name = req.getParameter("name"); 
		System.out.println("hello"); 
		session.setAttribute("name", name);
		return "home"; //Everytime we change the view technology, no need to change here , directly it can be given in app.prop file
	}*/
	
	/*
	@RequestMapping("home")
	public ModelAndView output(@RequestParam("name") String myName)//request param is used to map the string in url to myName
	{
		ModelAndView obj = new ModelAndView(); // Instead of session we can use modelandview object in spring framework to send data(model)and view
		obj.addObject("name", myName);
		obj.setViewName("home");
		return obj;
	}*/
	
	@RequestMapping("home")
	public ModelAndView output(Employee emp)//Instead of directly sending name we can even use object 
	{
		ModelAndView obj = new ModelAndView(); //http://localhost:8080/home?id=1&name=Nikki
		obj.addObject("obj", emp);
		obj.setViewName("home");
		return obj;
		
	}

}
