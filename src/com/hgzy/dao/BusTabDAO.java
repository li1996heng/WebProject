package com.hgzy.dao;

import java.util.List;

import org.hibernate.LockMode;

import com.hgzy.entity.BusTab;

public interface BusTabDAO {
	public void save(BusTab transientInstance) ;

	public void delete(BusTab persistentInstance);

	public BusTab findById(java.lang.Integer id);

	public List findByExample(BusTab instance);
	public List findByProperty(String propertyName, Object value);

	public List findAll();

	public BusTab merge(BusTab detachedInstance) ;

	public void attachDirty(BusTab instance);

	public void attachClean(BusTab instance);
}
