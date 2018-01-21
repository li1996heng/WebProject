package com.hgzy.service.Impl;

import java.util.List;

import com.hgzy.dao.Impl.ShopTabDAOImpl;
import com.hgzy.entity.ShopTab;
import com.hgzy.service.ShopTabService;

public class ShopTabServiceImpl implements ShopTabService{
	private ShopTabDAOImpl shopDao;
	
	public void setShopDao(ShopTabDAOImpl shopDao) {
		this.shopDao = shopDao;
	}

	public List<ShopTab> findAllShop(){
		return shopDao.findAll();
	}
	
	
	
	
}
