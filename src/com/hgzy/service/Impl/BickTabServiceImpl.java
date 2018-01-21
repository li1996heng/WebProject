package com.hgzy.service.Impl;

import java.util.List;

import com.hgzy.dao.Impl.BickTabDAOImpl;
import com.hgzy.entity.BickTab;
import com.hgzy.service.BickTabService;

public class BickTabServiceImpl implements BickTabService{
	private BickTabDAOImpl bickDao;

	public void setBickDao(BickTabDAOImpl bickDao) {
		this.bickDao = bickDao;
	}
	
	public List<BickTab> findAllBick(){
		return bickDao.findAll();
	}

	public List<BickTab> findBickByLike(String key) {
		return bickDao.findBickByLike(key);
	}
}
