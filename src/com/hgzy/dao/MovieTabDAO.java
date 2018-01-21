package com.hgzy.dao;

import java.util.List;

import org.hibernate.LockMode;

import com.hgzy.entity.MovieTab;

public interface MovieTabDAO {
	public void save(MovieTab transientInstance) ;
	public void delete(MovieTab persistentInstance);
	public MovieTab findById(java.lang.Integer id);
	public List findByExample(MovieTab instance) ;

	public List findByProperty(String propertyName, Object value) ;

	public List findAll() ;
	public MovieTab merge(MovieTab detachedInstance);

	public void attachDirty(MovieTab instance);

	public void attachClean(MovieTab instance) ;
}
