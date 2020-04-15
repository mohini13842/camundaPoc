package com.example.workflow.delegates;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.workflow.service.FetchMetaDataService;
import com.example.workflow.service.InsertErrorLogService;

@Component
public class InsertErrorLogsDelegate implements JavaDelegate{
	
	private final Logger LOGGER = Logger.getLogger(FetchMetaDataService.class.getName());
	
	@Autowired
	private InsertErrorLogService insertErrorLogService;

	public void execute(DelegateExecution arg0) throws Exception {
		// TODO Auto-generated method stub
		
		LOGGER.info("Mark status of the process as error");
		
		String processDefinationId = arg0.getProcessDefinitionId();
		
		insertErrorLogService.insertErrorData(processDefinationId);
		
	}

}
