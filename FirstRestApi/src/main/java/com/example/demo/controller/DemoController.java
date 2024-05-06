package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modal.Apps;
import com.example.demo.repository.AppRepository;


@Controller
public class DemoController {
	
	@Autowired
	AppRepository repo;
	
	@RequestMapping
	public String getApps() {
		  List<Apps> findAll = repo.findAll();
		return findAll.toString();
		
	}
	
	
	
	
	
	

}
