package com.hgzy.dao;

import java.util.List;

import org.hibernate.LockMode;

import com.hgzy.entity.PlayTab;

public interface PlayTabDAO {
	public void save(PlayTab transientInstance) ;

	public void delete(PlayTab persistentInstance);
	public PlayTab findById(java.lang.Integer id);

	public List findByExample(PlayTab instance) ;
	public List findByProperty(String propertyName, Object value) ;
	public List findAll();

	public PlayTab merge(PlayTab detachedInstance);

	public void attachDirty(PlayTab instance);

	public void attachClean(PlayTab instance);
}
