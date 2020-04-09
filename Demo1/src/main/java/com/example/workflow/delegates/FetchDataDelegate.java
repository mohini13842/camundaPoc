package com.example.workflow.delegates;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.workflow.entity.ProcessLog;
import com.example.workflow.repositary.FetchDataRepo;


public class FetchDataDelegate implements JavaDelegate {

	private final Logger LOGGER = Logger.getLogger(FetchDataDelegate.class.getName());
	
	@Autowired
	private FetchDataRepo fetchDataRepo;

	public void execute(DelegateExecution arg0) throws Exception {
		// TODO Auto-generated method stub
		
		LOGGER.info("\n\n... FetchDataDelegate invoked by : processDefinationIds" + arg0.getProcessDefinitionId());
		
		LOGGER.info("Inserting records in processLog table");
		
		fetchDataRepo.save(new ProcessLog("efg", "abc", "started"));
		
		//fetchDataRepo.findAll().forEach(x -> System.out.println(x));


		
		
		
		
		
	}

	}
