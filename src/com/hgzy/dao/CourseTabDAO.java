package com.hgzy.dao;

import java.util.List;

import org.hibernate.LockMode;

import com.hgzy.entity.CourseTab;

public interface CourseTabDAO {
	public void save(CourseTab transientInstance);
	public void delete(CourseTab persistentInstance) ;

	public CourseTab findById(java.lang.Integer id) ;
	
	
	public List<CourseTab> findByUserId(java.lang.Integer id);

	public List findByExample(CourseTab instance);

	public List findByProperty(String propertyName, Object value);

	public List findAll();

	public CourseTab merge(CourseTab detachedInstance);

	public void attachDirty(CourseTab instance);

	public void attachClean(CourseTab instance);
}
