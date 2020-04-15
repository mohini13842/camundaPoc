package com.example.workflow.delegates;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckFeedDeegate implements JavaDelegate{
	
	private final Logger LOGGER = Logger.getLogger(CheckFeedDeegate.class.getName());

	public void execute(DelegateExecution exc) throws Exception {
		// TODO Auto-generated method stub
		
		exc.getVariable("count");
		//exc.getVariable("offset");
		
		LOGGER.info("variables passed in second bpmn : "+ exc.getVariable("count"));
		//LOGGER.info("variables passed in second bpmn : "+ count);
		//LOGGER.info("variables 2 passed in secomg bpmn : "+ exc.getVariable("offset"));
	}

}
