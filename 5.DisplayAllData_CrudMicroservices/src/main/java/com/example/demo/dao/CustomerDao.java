package com.example.demo.dao;


import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CustTable;


@Repository
public interface CustomerDao extends CrudRepository<CustTable, Integer> {
		


	//List<CustTable> findByUnameAndPass(String un,String ps);
			
			
}
