package com.hgzy.dao;

import java.util.List;

import com.hgzy.entity.FoodTab;

public interface FoodTabDAO {
	public void save(FoodTab transientInstance) ;

	public void delete(FoodTab persistentInstance);

	public FoodTab findById(java.lang.Integer id);

	public List<FoodTab> findByExample(FoodTab instance);
	public List<FoodTab> findByProperty(String propertyName, Object value);

	public List<FoodTab> findAll();
	public FoodTab merge(FoodTab detachedInstance);

	public void attachDirty(FoodTab instance);

	public void attachClean(FoodTab instance);

	/*
	 * 查询总记录数
	 */
	public int findCount();
	
	/*
	 * 分页查询部门
	 */
	public List<FoodTab> findByPage(int begin, int pageSize);
	
	/*
	 * 根据某一字段模糊查询
	 */
	public List<FoodTab> findFoodByLike(String key);
}
