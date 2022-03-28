package com.buildtool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buildtool.bean.EnvironmentBean;

@Repository
public interface EnvironmentRepository extends JpaRepository<EnvironmentBean, Integer> {

}
