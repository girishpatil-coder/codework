package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CustTable;
import com.example.demo.services.ServiceS;


@RestController
public class CustomerController {

	
	
	@Autowired
	private ServiceS s;
	
	@RequestMapping(value = "/custadd",method = RequestMethod.POST)
	public String addData(@RequestBody CustTable customer)
	{
		System.out.println("Data form ARC or Postman:"+customer);
		
			int i=s.addCustomer(customer);
			
			return "Data Insert";
	}
	
	
	
}
