package com.hgzy.dao;

import java.util.List;

import org.hibernate.LockMode;

import com.hgzy.entity.UserTab;

public interface UserTabDAO {
	public UserTab findUserByNameAndPwd(UserTab user);
	
	public UserTab findUserByCode(String code);
	
	public void save(UserTab transientInstance);
	
	public void delete(UserTab persistentInstance) ;
	
	public UserTab findById(java.lang.Integer id);
	
	public List findByExample(UserTab instance);
	
	public List findByProperty(String propertyName, Object value);
	
	public List findByUname(Object uname);
	
	public List findByPwd(Object pwd);
	
	public List findByRoles(Object roles);
	
	public List findAll();
	
	public UserTab merge(UserTab detachedInstance);
	
	public void attachDirty(UserTab instance);
	
	public void attachClean(UserTab instance);
	
/*	public void update(String pwd,Integer id);*/
	
	
}
