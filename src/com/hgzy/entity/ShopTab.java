package com.hgzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * ShopTab entity. @author MyEclipse Persistence Tools
 */

public class ShopTab implements java.io.Serializable {

	// Fields

	private Integer shopId;
	private String shopName;
	private Set foodTabs = new HashSet(0);

	// Constructors

	/** default constructor */
	public ShopTab() {
	}

	/** minimal constructor */
	public ShopTab(String shopName) {
		this.shopName = shopName;
	}

	/** full constructor */
	public ShopTab(String shopName, Set foodTabs) {
		this.shopName = shopName;
		this.foodTabs = foodTabs;
	}

	// Property accessors

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Set getFoodTabs() {
		return this.foodTabs;
	}

	public void setFoodTabs(Set foodTabs) {
		this.foodTabs = foodTabs;
	}

}