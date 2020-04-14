package com.example.workflow.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workflow.entity.ProcessLog;
import com.example.workflow.repositary.InsertErroLogRepo;

@Service
public class InsertErrorLogService {

	private final Logger LOGGER = Logger.getLogger(InsertErrorLogService.class.getName());
	
	@Autowired
	private InsertErroLogRepo insertErroLogRepo;
	
	public void insertErrorData(String processDefinationId) {
	
	LOGGER.info("Inserting error records in processLog table");
	
	ProcessLog processLog = new ProcessLog();
	processLog.setId(processDefinationId);
	processLog.setProcessName("datafetch");
	processLog.setStatus("error");
	insertErroLogRepo.save(processLog);
	
}
}
