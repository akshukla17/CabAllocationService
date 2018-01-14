package com.spring.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="cab")
public class Cab {

	@Id
	private String cab_id;
	private long cost;
	private int capacity;
	
	public String getCab_id() {
		return cab_id;
	}
	public void setCab_id(String cab_id) {
		this.cab_id = cab_id;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
