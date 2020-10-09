package com.example.demo.services;

import com.example.demo.model.CustTable;


public interface ServiceS {

	public CustTable getCustomer(int id);
	
	public void upDateCustomer(CustTable custTable);
	
}
