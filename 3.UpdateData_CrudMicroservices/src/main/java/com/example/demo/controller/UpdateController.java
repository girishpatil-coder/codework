package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CustTable;
import com.example.demo.services.ServiceS;

@RestController
public class UpdateController {
	
	@Autowired
	private ServiceS s;
	
	@GetMapping(value = "/getcust/{id}")
	public CustTable getCustomer(@PathVariable("id") int id)
	{
		System.out.println(id);
		CustTable cc=s.getCustomer(id);
		
		return cc;
	}
	
	@PutMapping(value ="/up" )
	public String updateCustomer(@RequestBody CustTable custTable )
	{
			s.upDateCustomer(custTable);
			
		return "Update Data";
	}

}
