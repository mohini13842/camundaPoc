package com.example.workflow.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.workflow.entity.ProcessLog;

@Repository
public interface InsertErroLogRepo extends JpaRepository<ProcessLog, Long>{
	
	

	
}
