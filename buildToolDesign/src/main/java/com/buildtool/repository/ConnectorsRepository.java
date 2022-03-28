package com.buildtool.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.buildtool.bean.ConnectorsBean;

@Repository
public interface ConnectorsRepository extends JpaRepository<ConnectorsBean, Integer> {

	@Query(value = "select * from connectors where con_type=:connectorType",nativeQuery = true)
	List<ConnectorsBean> findByConType(@Param("connectorType") Integer connectorType);

}
