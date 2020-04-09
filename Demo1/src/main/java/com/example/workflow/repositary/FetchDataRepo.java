package com.example.workflow.repositary;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.workflow.entity.ProcessLog;

public interface FetchDataRepo extends CrudRepository<ProcessLog, Long>{

	List<ProcessLog> findAll();
}
