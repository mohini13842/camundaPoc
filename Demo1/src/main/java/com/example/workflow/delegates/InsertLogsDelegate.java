package com.example.workflow.delegates;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.workflow.entity.ProcessLog;
import com.example.workflow.repositary.InsertLogRepo;

@Component
public class InsertLogsDelegate implements JavaDelegate{

	private final Logger LOGGER = Logger.getLogger(InsertLogsDelegate.class.getName());
	
	@Autowired
	private InsertLogRepo insertLogRepo;

	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
LOGGER.info("\n\n... InsertLogsDelegate invoked by : processDefinationIds" + execution.getProcessDefinitionId());
		
		LOGGER.info("Inserting records in processLog table");
		
		ProcessLog processLog = new ProcessLog();
		processLog.setId(execution.getProcessDefinitionId());
		processLog.setProcessName("datafetch");
		processLog.setStatus("started");
		insertLogRepo.save(processLog);
		
		LOGGER.info("inserted completely.");
		

		
	}

}
