package com.hgzy.dao;

import java.util.List;
import com.hgzy.entity.FoodTab;
import com.hgzy.entity.LibraryTab;

public interface LibraryTabDAO {
	public List<LibraryTab> findLibraryByLike(String key);
	public void save(LibraryTab transientInstance);
	public void delete(LibraryTab persistentInstance);
	public LibraryTab findById(java.lang.Integer id);
	public List<LibraryTab> findByExample(LibraryTab instance) ;
	public List<LibraryTab> findByProperty(String propertyName, Object value);
	public List<LibraryTab> findAll();
	public LibraryTab merge(LibraryTab detachedInstance);
	public void attachDirty(LibraryTab instance);
	public void attachClean(LibraryTab instance);
	/*
	 * 查询总记录数
	 */
	public int findCount();
	
	/*
	 * 分页查询部门
	 */
	public List<LibraryTab> findByPage(int begin, int pageSize);
	
	/*
	 * 根据某一字段模糊查询
	 */
	public List<LibraryTab> findFoodByLike(String key);
}
