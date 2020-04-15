package com.example.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.DelegateVariableMapping;
import org.camunda.bpm.engine.delegate.VariableScope;
import org.camunda.bpm.engine.variable.VariableMap;

public class DelegatedVarMapping implements DelegateVariableMapping {

	  
	public void mapInputVariables(DelegateExecution arg0, VariableMap variableMap) {
		variableMap.putValue("count", "count");		
	}

	public void mapOutputVariables(DelegateExecution arg0, VariableScope variableMap) {
		// TODO Auto-generated method stub
		
		variableMap.setVariable("countoutput", "outValue");

	}
}
