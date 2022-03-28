package com.buildtool.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buildtool.bean.ConnectorType;
import com.buildtool.repository.ConnectorTypeRepository;

@Service
public class ConnectorTypeService {

	@Autowired
	private ConnectorTypeRepository connectorTypeRepository;
	
	public List<ConnectorType> getAllConnectorTypes(){
		return connectorTypeRepository.findAll();
	}
	
}
