package com.hgzy.service.Impl;

import java.util.List;

import com.hgzy.dao.Impl.StoreTabDAOImpl;
import com.hgzy.entity.StoreTab;
import com.hgzy.service.StoreTabService;

public class StoreTabServiceImpl implements StoreTabService{
	private StoreTabDAOImpl storeDao;
	
	public void setStoreDao(StoreTabDAOImpl storeDao) {
		this.storeDao = storeDao;
	}
	
	public List<StoreTab> findAStore(){
		return storeDao.findAll();
	}
}
