package com.buildtool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buildtool.bean.ProductBean;

@Repository
public interface ProductDetailRepository extends JpaRepository<ProductBean, Integer> {

}
