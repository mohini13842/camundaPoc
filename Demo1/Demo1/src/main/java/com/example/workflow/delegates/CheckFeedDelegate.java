package com.example.workflow.delegates;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckFeedDelegate implements JavaDelegate{
	
	private final Logger LOGGER = Logger.getLogger(CheckFeedDelegate.class.getName());

	public void execute(DelegateExecution exc) throws Exception {
		// TODO Auto-generated method stub
		
		exc.getVariable("count");
		
		LOGGER.info("variables passed in second bpmn : "+ exc.getVariable("count"));
		
		//do the further processing here
	}

}
