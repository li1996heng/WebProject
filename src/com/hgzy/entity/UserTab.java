package com.hgzy.entity;

/**
 * UserTab entity. @author MyEclipse Persistence Tools
 */

public class UserTab implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String pwd;
	private String email;
	private Integer state;
	private String code;

	// Constructors

	/** default constructor */
	public UserTab() {
	}

	/** minimal constructor */
	public UserTab(String username, String pwd, String email, Integer state) {
		this.username = username;
		this.pwd = pwd;
		this.email = email;
		this.state = state;
	}

	/** full constructor */
	public UserTab(String username, String pwd, String email, Integer state,
			String code) {
		this.username = username;
		this.pwd = pwd;
		this.email = email;
		this.state = state;
		this.code = code;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}