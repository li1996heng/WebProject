package com.hgzy.entity;

import java.sql.Date;

/**
 * FoodTab entity. @author MyEclipse Persistence Tools
 */

public class FoodTab implements java.io.Serializable {

	// Fields

	private Integer goodsId;
	private ShopTab shopTab;
	private Integer shopId;
	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	private String foodName;
	private Double oldprice;
	private Double newprice;
	private Date newstime;
	private String discount;
	private String hava;

	// Constructors

	/** default constructor */
	public FoodTab() {
	}

	/** minimal constructor */
	public FoodTab(String foodName, Double oldprice, Double newprice) {
		this.foodName = foodName;
		this.oldprice = oldprice;
		this.newprice = newprice;
	}

	/** full constructor */
	public FoodTab(ShopTab shopTab, String foodName, Double oldprice,
			Double newprice, Date newstime, String discount, String hava) {
		this.shopTab = shopTab;
		this.foodName = foodName;
		this.oldprice = oldprice;
		this.newprice = newprice;
		this.newstime = newstime;
		this.discount = discount;
		this.hava = hava;
	}

	// Property accessors

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public ShopTab getShopTab() {
		return this.shopTab;
	}

	public void setShopTab(ShopTab shopTab) {
		this.shopTab = shopTab;
	}

	public String getFoodName() {
		return this.foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
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

	public Date getNewstime() {
		return this.newstime;
	}

	public void setNewstime(Date newstime) {
		this.newstime = newstime;
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

}