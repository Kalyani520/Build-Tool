package com.buildtool.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buildtool.bean.ProductBean;
import com.buildtool.repository.ProductDetailRepository;

@Service
public class ProductDetailService {

	@Autowired
	private ProductDetailRepository productDetailRepository;
	
	public List<ProductBean> getAllProducts(){
		return productDetailRepository.findAll();
	}
	
}
