package com.hgzy.dao;

import java.util.List;
import com.hgzy.entity.BickTab;

public interface BickTabDAO {
	public void save(BickTab transientInstance);
	
	public void delete(BickTab persistentInstance) ;

	public BickTab findById(java.lang.Integer id);

	public List<BickTab> findByExample(BickTab instance) ;


	public List<BickTab> findByProperty(String propertyName, Object value);

	public List<BickTab> findAll() ;
	
	public BickTab merge(BickTab detachedInstance);


	public void attachDirty(BickTab instance) ;

	public void attachClean(BickTab instance);
	public List<BickTab> findBickByLike(String key);

}