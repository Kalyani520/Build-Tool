package com.buildtool.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buildtool.bean.CustomerBean;
import com.buildtool.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;
	
	public List<CustomerBean> getAll() {
		return repository.findAll();
	}
	
}
