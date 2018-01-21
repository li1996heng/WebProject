package com.hgzy.entity;

/**
 * BickTab entity. @author MyEclipse Persistence Tools
 */

public class BickTab implements java.io.Serializable {

	// Fields

	private Integer bickId;
	private String bickName;
	private Integer number;
	private Double price;
	private String bickplace;

	// Constructors

	/** default constructor */
	public BickTab() {
	}

	/** minimal constructor */
	public BickTab(String bickName) {
		this.bickName = bickName;
	}

	/** full constructor */
	public BickTab(String bickName, Integer number, Double price,
			String bickplace) {
		this.bickName = bickName;
		this.number = number;
		this.price = price;
		this.bickplace = bickplace;
	}

	// Property accessors

	public Integer getBickId() {
		return this.bickId;
	}

	public void setBickId(Integer bickId) {
		this.bickId = bickId;
	}

	public String getBickName() {
		return this.bickName;
	}

	public void setBickName(String bickName) {
		this.bickName = bickName;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getBickplace() {
		return this.bickplace;
	}

	public void setBickplace(String bickplace) {
		this.bickplace = bickplace;
	}

}