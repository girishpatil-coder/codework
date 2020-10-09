package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.CustTable;


@Service
public class ServicesImpl implements ServiceS{

	@Autowired
	private CustomerDao d;

	@Override
	public List<CustTable> getAllData() {
		List<CustTable> ct=(List<CustTable>)d.findAll();
		return ct;
	}
	
//	@Override
//	public List<CustTable> getAllData(String un, String ps) {
//			
//	//	d.findByUnameAndPass(un, ps);
//		List<CustTable> ct=(List<CustTable>)d.findAll();
//		
//		return ct;
//	}

}
