package com.hgzy.entity;

import java.sql.Time;

/**
 * BusTab entity. @author MyEclipse Persistence Tools
 */

public class BusTab implements java.io.Serializable {

	// Fields

	private Integer busId;
	private String busName;
	private String thisStation;
	private String nextStation;
	private Time times;
	private String remarks;

	// Constructors

	/** default constructor */
	public BusTab() {
	}

	/** minimal constructor */
	public BusTab(String busName, String thisStation, String nextStation,
			Time times) {
		this.busName = busName;
		this.thisStation = thisStation;
		this.nextStation = nextStation;
		this.times = times;
	}

	/** full constructor */
	public BusTab(String busName, String thisStation, String nextStation,
			Time times, String remarks) {
		this.busName = busName;
		this.thisStation = thisStation;
		this.nextStation = nextStation;
		this.times = times;
		this.remarks = remarks;
	}

	// Property accessors

	public Integer getBusId() {
		return this.busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	public String getBusName() {
		return this.busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getThisStation() {
		return this.thisStation;
	}

	public void setThisStation(String thisStation) {
		this.thisStation = thisStation;
	}

	public String getNextStation() {
		return this.nextStation;
	}

	public void setNextStation(String nextStation) {
		this.nextStation = nextStation;
	}

	public Time getTimes() {
		return this.times;
	}

	public void setTimes(Time times) {
		this.times = times;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}