package com.buildtool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buildtool.bean.CustomerBean;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerBean, Integer> {

	
}

