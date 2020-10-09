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
	public CustTable getCustomer(int id) {
		
	CustTable ct=	d.findById(id).get();
		
	System.out.println("services Data:-"+ct);
		return ct;
	}

	@Override
	public void upDateCustomer(CustTable custTable) {
		
		d.save(custTable);
		
	}

}
