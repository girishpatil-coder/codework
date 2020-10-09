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
	public void deleteCustomer(int id) {
		d.deleteById(id);
		
	}

}
