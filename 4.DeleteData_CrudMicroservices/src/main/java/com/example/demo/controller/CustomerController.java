package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value = "/del/{id}",method = RequestMethod.DELETE)
	public String addData(@PathVariable("id") int id )
	{
		
			s.deleteCustomer(id);
			
			return "Data Delete";
	}
	
	
	
}
