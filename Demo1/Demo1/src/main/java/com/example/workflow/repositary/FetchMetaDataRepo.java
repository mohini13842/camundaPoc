package com.example.workflow.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.workflow.entity.Metadata;

@Repository
public interface FetchMetaDataRepo extends JpaRepository<Metadata, Long> {

	List<Metadata> findAll();
}
