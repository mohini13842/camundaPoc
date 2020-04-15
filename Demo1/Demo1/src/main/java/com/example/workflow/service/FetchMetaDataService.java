package com.example.workflow.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workflow.entity.Metadata;
import com.example.workflow.repositary.FetchMetaDataRepo;

@Service
public class FetchMetaDataService {

	private final Logger LOGGER = Logger.getLogger(FetchMetaDataService.class.getName());

	@Autowired
	private FetchMetaDataRepo fetchDataRepo;

	public List<Metadata> getMetadata() {

		List<Metadata> metadataList = fetchDataRepo.findAll();
		return metadataList;

	}

	public void insertData() {

		Metadata metadata = new Metadata();
		metadata.setId("sadsa");
		metadata.setCount("11");
		// metadata.setLimit("10");
		metadata.setTotal("20");
		metadata.setOffsett("12");
		fetchDataRepo.save(metadata);
	}
}
