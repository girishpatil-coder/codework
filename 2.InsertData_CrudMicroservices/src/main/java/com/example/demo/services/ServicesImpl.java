package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.CustTable;


@Service
public class ServicesImpl implements ServiceS{

	@Autowired
	private CustomerDao d;
	
	@Override
	public int addCustomer(CustTable c) {
		
		d.save(c);
		System.out.println("services Data:-"+c);
		return c.getId();
	}

}
