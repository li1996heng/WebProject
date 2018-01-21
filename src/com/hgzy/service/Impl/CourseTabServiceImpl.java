package com.hgzy.service.Impl;

import java.util.List;

import com.hgzy.dao.Impl.CourseTabDAOImpl;
import com.hgzy.entity.CourseTab;
import com.hgzy.service.CourseTabService;

public class CourseTabServiceImpl implements CourseTabService{
	private CourseTabDAOImpl courseDao;

	public void setCourseDao(CourseTabDAOImpl courseDAO) {
		this.courseDao = courseDAO;
	}
	
	public List<CourseTab> findAllCourseTabs(){
		return courseDao.findAll();
	}
	
	public List<CourseTab>findCourseTabByUserId(Integer id){
		return courseDao.findByUserId(id);
	}
	
	
}
