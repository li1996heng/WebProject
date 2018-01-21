package com.hgzy.service;

import java.util.List;

import com.hgzy.entity.CourseTab;

public interface CourseTabService {
	public List<CourseTab> findAllCourseTabs();
	
	
	public List<CourseTab>findCourseTabByUserId(Integer id);
}
