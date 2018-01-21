package com.hgzy.dao;

import java.util.List;

import org.hibernate.LockMode;

import com.hgzy.entity.ShopTab;

public interface ShopTabDAO {
	public void save(ShopTab transientInstance);

	public void delete(ShopTab persistentInstance);

	public ShopTab findById(java.lang.Integer id);

	public List findByExample(ShopTab instance);
	

	public List findByProperty(String propertyName, Object value) ;

	public List findAll() ;

	public ShopTab merge(ShopTab detachedInstance);

	public void attachDirty(ShopTab instance);

	public void attachClean(ShopTab instance);
}