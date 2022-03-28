package com.buildtool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buildtool.bean.ConnectorType;

@Repository
public interface ConnectorTypeRepository extends JpaRepository<ConnectorType, Integer> {

}
