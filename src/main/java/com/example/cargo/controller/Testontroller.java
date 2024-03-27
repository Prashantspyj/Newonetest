package com.example.cargo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.cargo.service.Cargoqouteservice;



@Controller
public class Testontroller {

	@Autowired
	private Cargoqouteservice cargoqouteservice;
	
	@GetMapping("/")
	public String viewHomePage() {
	
		return "index";
	}
	@GetMapping("/Gallery")
	public String viewgallery() {

		return "gallery";
	}
	@GetMapping("/Feedback")
	public String viewfeedback() {
	
		return "requestqoute";
	}
	@GetMapping("/ContactUs")
	public String viewcontact() {

		return "contactus";
	}
	@GetMapping("/Service")
	public String viewservice() {

		return "service";
	}
	@GetMapping("/News")
	public String viewnews() {

		return "news";
	}
	
	/*
	 * @GetMapping("/") public String viewHomePage(Model model) {
	 * model.addAttribute("allemplist", employeeServiceImpl.getAllEmployee());
	 * return "index"; }
	 * 
	 * @GetMapping("/") public String viewHomePage(Model model) {
	 * model.addAttribute("allemplist", employeeServiceImpl.getAllEmployee());
	 * return "index"; }
	 */
	 
	
}