package com.hgzy.entity;

/**
 * ClassroomTab entity. @author MyEclipse Persistence Tools
 */

public class ClassroomTab implements java.io.Serializable {

	// Fields

	private Integer classroomId;
	private String classroomName;
	private String class_;
	private String teacher;
	private String hava;

	// Constructors

	/** default constructor */
	public ClassroomTab() {
	}

	/** minimal constructor */
	public ClassroomTab(String classroomName, String hava) {
		this.classroomName = classroomName;
		this.hava = hava;
	}

	/** full constructor */
	public ClassroomTab(String classroomName, String class_, String teacher,
			String hava) {
		this.classroomName = classroomName;
		this.class_ = class_;
		this.teacher = teacher;
		this.hava = hava;
	}

	// Property accessors

	public Integer getClassroomId() {
		return this.classroomId;
	}

	public void setClassroomId(Integer classroomId) {
		this.classroomId = classroomId;
	}

	public String getClassroomName() {
		return this.classroomName;
	}

	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getTeacher() {
		return this.teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getHava() {
		return this.hava;
	}

	public void setHava(String hava) {
		this.hava = hava;
	}

}