package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
//	@RequestMapping(value = "/logincheck/{uname}/{pass}",method = RequestMethod.GET)
//	public List<CustTable> getAllData(@PathVariable("uname") String un,@PathVariable("pass") String ps)
//	{
//			System.out.println("Get All Data Check:"+un+" "+ps);
//			
//			List<CustTable> ct=(List<CustTable>)s.getAllData(un, ps);
//			return ct;
//	}
//	
		@GetMapping(value = "/getall")
		public List<CustTable> getAllData()
		{
			List<CustTable> ct=(List<CustTable>)s.getAllData();
			return ct;
		}
	
}
