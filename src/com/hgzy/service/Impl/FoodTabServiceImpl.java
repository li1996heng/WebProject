package com.hgzy.service.Impl;

import java.util.List;

import com.hgzy.dao.Impl.FoodTabDAOImpl;
import com.hgzy.entity.FoodTab;
import com.hgzy.service.FoodTabService;
import com.hgzy.util.PageBean;

public class FoodTabServiceImpl implements FoodTabService{
	private FoodTabDAOImpl foodDao;

	public void setFoodDao(FoodTabDAOImpl foodDao) {
		this.foodDao = foodDao;
	}
	
	/**
	 * 业务层实现分页查询的功能
	 * @param currPage
	 * @return
	 */
	public PageBean<FoodTab> findAllFoodByPage(Integer currPage){
		PageBean<FoodTab> pageBean = new PageBean<FoodTab>();
		//封装当前页数
		pageBean.setCurrPage(currPage);
		//封装每页显示的记录数
		int pageSize = 10;	//每页显示10条
		pageBean.setPageSize(pageSize);
		//封装总记录数
		int totalCount = foodDao.findCount();
		pageBean.setTotalCount(totalCount);
		//封装总页数    总页数 = 总记录数/每页显示的记录数  
		double tc = totalCount;
		Double num = Math.ceil(tc/pageSize);	//向上取整
		pageBean.setTotalPage(num.intValue());
		//封装每页显示的数据
		int begin = (currPage - 1)*pageSize;
		List<FoodTab> list = foodDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}
	
	public List<FoodTab> findAllFood(){
		return foodDao.findAll();
	}
	
	public void addFood(FoodTab food){
		foodDao.save(food);
	}
	
	public void deleteFood(Integer id){
		foodDao.delete(foodDao.findById(id));
	}
	
	public void updateFood(FoodTab food){
		foodDao.attachDirty(food);
	}
	
	public FoodTab findFoodById(Integer id){
		return foodDao.findById(id);
	}

	public List<FoodTab> findFoodByLike(String key) {
		return foodDao.findFoodByLike(key);
	}
	
}
