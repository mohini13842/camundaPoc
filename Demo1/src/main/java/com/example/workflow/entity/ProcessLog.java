package com.example.workflow.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "processLog")
public class ProcessLog {

	@Id
	private String Id;

	private String processName;

	private String status;

	public ProcessLog() {
		super();
			}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ProcessLog [Id=" + Id + ", processName=" + processName + ", status=" + status + "]";
	}

}
