package com.buildtool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buildtool.bean.ConnectorType;
import com.buildtool.bean.ConnectorsBean;
import com.buildtool.bean.CustomerBean;
import com.buildtool.bean.EnvironmentBean;
import com.buildtool.bean.ProductBean;
import com.buildtool.services.ConnectorTypeService;
import com.buildtool.services.ConnectorsService;
import com.buildtool.services.CustomerService;
import com.buildtool.services.EnvironmentService;
import com.buildtool.services.ProductDetailService;

@RestController
@RequestMapping("/api/")
@CrossOrigin(origins = "*")
public class ConnectorController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private ConnectorTypeService connectorTypeService;
	
	@Autowired
	private ProductDetailService productService;
	
	@Autowired
	private EnvironmentService environmentService;
	
	@Autowired
	private ConnectorsService connectorService;
	
	@GetMapping("/connectortype")
	public ResponseEntity<List<ConnectorType>> getConnectorType(){


		List<ConnectorType> typeList = connectorTypeService.getAllConnectorTypes();
		
		return new ResponseEntity<List<ConnectorType>>(typeList,HttpStatus.OK);
		
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<ProductBean>> getProducts(){

		List<ProductBean> productList = productService.getAllProducts();
		
		return new ResponseEntity<List<ProductBean>>(productList,HttpStatus.OK);
		
	}
	
	@GetMapping("/environments")
	public ResponseEntity<List<EnvironmentBean>> getEnvironments(){

		List<EnvironmentBean> envList = environmentService.getAllEnvironments();
		
		return new ResponseEntity<List<EnvironmentBean>>(envList,HttpStatus.OK);
		
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<CustomerBean>> getAllCustomer(){
		
		List<CustomerBean> customerList = customerService.getAll();
					
		return new ResponseEntity<List<CustomerBean>>(customerList,HttpStatus.OK);
		
	}
	
	@GetMapping("/connectors/{connectorType}")
	public ResponseEntity<List<ConnectorsBean>> getAllConnectors(@PathVariable("connectorType") int connectorType){
	
		List<ConnectorsBean> connectorsList = connectorService.getAllConnectors(connectorType);
		
		return new ResponseEntity<List<ConnectorsBean>>(connectorsList,HttpStatus.OK);
		
	}
}
