package com.hgzy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * PlayTab entity. @author MyEclipse Persistence Tools
 */

public class PlayTab implements java.io.Serializable {

	// Fields

	private Integer playId;
	private String playName;
	private Set storeTabs = new HashSet(0);

	// Constructors

	/** default constructor */
	public PlayTab() {
	}

	/** minimal constructor */
	public PlayTab(String playName) {
		this.playName = playName;
	}

	/** full constructor */
	public PlayTab(String playName, Set storeTabs) {
		this.playName = playName;
		this.storeTabs = storeTabs;
	}

	// Property accessors

	public Integer getPlayId() {
		return this.playId;
	}

	public void setPlayId(Integer playId) {
		this.playId = playId;
	}

	public String getPlayName() {
		return this.playName;
	}

	public void setPlayName(String playName) {
		this.playName = playName;
	}

	public Set getStoreTabs() {
		return this.storeTabs;
	}

	public void setStoreTabs(Set storeTabs) {
		this.storeTabs = storeTabs;
	}

}