package com.buildtool.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buildtool.bean.EnvironmentBean;
import com.buildtool.repository.EnvironmentRepository;

@Service
public class EnvironmentService {

	@Autowired
	private EnvironmentRepository environmentRepository;
	
	public List<EnvironmentBean> getAllEnvironments(){
		return environmentRepository.findAll();
	}
}
