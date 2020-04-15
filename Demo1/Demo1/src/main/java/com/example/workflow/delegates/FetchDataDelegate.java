package com.example.workflow.delegates;

import java.util.List;
import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.example.workflow.entity.Metadata;
import com.example.workflow.repositary.FetchDataRepo;
import com.example.workflow.service.FetchDataService;

@Component
public class FetchDataDelegate implements JavaDelegate {

	private final Logger LOGGER = Logger.getLogger(FetchDataDelegate.class.getName());

	@Autowired
	private FetchDataRepo fetchDataRepo;

	@Autowired
	private FetchDataService fetchService;

	public void execute(DelegateExecution arg0) throws Exception {
		// TODO Auto-generated method stub

		LOGGER.info("\n\n... FetchDataDelegate invoked by : processDefinationIds" + arg0.getProcessDefinitionId());

		// LOGGER.info("Fetching metadata from metadataDetails table");
		
		fetchService.insertData();

		List<Metadata> metadataList = fetchService.getMetadata();
		
		
		if(!CollectionUtils.isEmpty(metadataList)){
			
			arg0.setVariable("found", true);
			 LOGGER.info("metadata list is not empty");
			 
			 for (Metadata metadata : metadataList) {
					
				 LOGGER.info("Fetching metadata count from metadataDetails table  : " + metadata.getCount());
				 
				 arg0.setVariable("count", metadata.getCount());
				 arg0.setVariable("offset", metadata.getOffsett());
			}
			 
			
		}else{
			
			arg0.setVariable("found", false);
			LOGGER.info("metadata list is empty");
		}

		LOGGER.info("fetch records successfully.");

	}

}
