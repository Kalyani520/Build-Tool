package com.buildtool.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buildtool.bean.ConnectorsBean;
import com.buildtool.repository.ConnectorsRepository;

@Service
public class ConnectorsService {

	@Autowired
	private ConnectorsRepository connectorsRepository;
	
	public List<ConnectorsBean> getAllConnectors(int connectorType){
	
		return connectorsRepository.findByConType(connectorType);
		
	}
}
