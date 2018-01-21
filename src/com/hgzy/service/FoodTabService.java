package com.hgzy.service;

import java.util.List;

import com.hgzy.entity.FoodTab;
import com.hgzy.entity.LibraryTab;
import com.hgzy.util.PageBean;

public interface FoodTabService {
	public PageBean<FoodTab> findAllFoodByPage(Integer currPage);
	
	public List<FoodTab> findAllFood();
	
	public void addFood(FoodTab food);
	
	public void deleteFood(Integer id);
	
	public void updateFood(FoodTab food);
	
	public FoodTab findFoodById(Integer id);
	
	public List<FoodTab>findFoodByLike(String key);
	
	
}
