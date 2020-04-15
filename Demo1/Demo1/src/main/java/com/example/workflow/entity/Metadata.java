package com.example.workflow.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Metadata")
public class Metadata {

	@Id
	private String id;

	private String count;

	private String Offsett;

	private String total;

	public Metadata() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	
	public String getOffsett() {
		return Offsett;
	}

	public void setOffsett(String offsett) {
		Offsett = offsett;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Metadata [count=" + count + ", offset=" + Offsett + ", total=" + total + "]";
	}

}
