package com.hgzy.entity;

/**
 * CourseTab entity. @author MyEclipse Persistence Tools
 */

public class CourseTab implements java.io.Serializable {

	// Fields

	private Integer courseId;
	private Integer userId;
	private String courseName;
	private String teacher;
	private String place;
	private String classtime;

	// Constructors

	/** default constructor */
	public CourseTab() {
	}

	/** minimal constructor */
	public CourseTab(String courseName, String teacher, String place) {
		this.courseName = courseName;
		this.teacher = teacher;
		this.place = place;
	}

	/** full constructor */
	public CourseTab(Integer userId, String courseName, String teacher,
			String place, String classtime) {
		this.userId = userId;
		this.courseName = courseName;
		this.teacher = teacher;
		this.place = place;
		this.classtime = classtime;
	}

	// Property accessors

	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTeacher() {
		return this.teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getClasstime() {
		return this.classtime;
	}

	public void setClasstime(String classtime) {
		this.classtime = classtime;
	}

}