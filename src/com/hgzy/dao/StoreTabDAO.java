package com.hgzy.dao;

import java.util.List;

import org.hibernate.LockMode;

import com.hgzy.entity.StoreTab;

public interface StoreTabDAO {
	public void save(StoreTab transientInstance);

	public void delete(StoreTab persistentInstance);

	public StoreTab findById(java.lang.Integer id);

	public List findByExample(StoreTab instance);

	public List findByProperty(String propertyName, Object value);

	public List findAll() ;
	
	public StoreTab merge(StoreTab detachedInstance);
	

	public void attachDirty(StoreTab instance) ;

	public void attachClean(StoreTab instance);
}
