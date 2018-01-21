package com.hgzy.entity;

/**
 * MovieTab entity. @author MyEclipse Persistence Tools
 */

public class MovieTab implements java.io.Serializable {

	// Fields

	private Integer cinemaId;
	private String cinemaName;
	private String moviceName;
	private String time;
	private String hava;

	// Constructors

	/** default constructor */
	public MovieTab() {
	}

	/** minimal constructor */
	public MovieTab(String cinemaName, String moviceName, String time) {
		this.cinemaName = cinemaName;
		this.moviceName = moviceName;
		this.time = time;
	}

	/** full constructor */
	public MovieTab(String cinemaName, String moviceName, String time,
			String hava) {
		this.cinemaName = cinemaName;
		this.moviceName = moviceName;
		this.time = time;
		this.hava = hava;
	}

	// Property accessors

	public Integer getCinemaId() {
		return this.cinemaId;
	}

	public void setCinemaId(Integer cinemaId) {
		this.cinemaId = cinemaId;
	}

	public String getCinemaName() {
		return this.cinemaName;
	}

	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}

	public String getMoviceName() {
		return this.moviceName;
	}

	public void setMoviceName(String moviceName) {
		this.moviceName = moviceName;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getHava() {
		return this.hava;
	}

	public void setHava(String hava) {
		this.hava = hava;
	}

}