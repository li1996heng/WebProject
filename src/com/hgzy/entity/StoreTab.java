package com.hgzy.entity;

/**
 * StoreTab entity. @author MyEclipse Persistence Tools
 */

public class StoreTab implements java.io.Serializable {

	// Fields

	private Integer storeId;
	private PlayTab playTab;
	private String stroeName;
	private Double oldprice;
	private Double newprice;
	private String discount;
	private String hava;
	private String remarks;

	// Constructors

	/** default constructor */
	public StoreTab() {
	}

	/** minimal constructor */
	public StoreTab(String stroeName, Double oldprice, Double newprice) {
		this.stroeName = stroeName;
		this.oldprice = oldprice;
		this.newprice = newprice;
	}

	/** full constructor */
	public StoreTab(PlayTab playTab, String stroeName, Double oldprice,
			Double newprice, String discount, String hava, String remarks) {
		this.playTab = playTab;
		this.stroeName = stroeName;
		this.oldprice = oldprice;
		this.newprice = newprice;
		this.discount = discount;
		this.hava = hava;
		this.remarks = remarks;
	}

	// Property accessors

	public Integer getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public PlayTab getPlayTab() {
		return this.playTab;
	}

	public void setPlayTab(PlayTab playTab) {
		this.playTab = playTab;
	}

	public String getStroeName() {
		return this.stroeName;
	}

	public void setStroeName(String stroeName) {
		this.stroeName = stroeName;
	}

	public Double getOldprice() {
		return this.oldprice;
	}

	public void setOldprice(Double oldprice) {
		this.oldprice = oldprice;
	}

	public Double getNewprice() {
		return this.newprice;
	}

	public void setNewprice(Double newprice) {
		this.newprice = newprice;
	}

	public String getDiscount() {
		return this.discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getHava() {
		return this.hava;
	}

	public void setHava(String hava) {
		this.hava = hava;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}