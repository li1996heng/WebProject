package com.hgzy.service.Impl;

import java.util.List;

import com.hgzy.dao.Impl.BusTabDAOImpl;
import com.hgzy.entity.BusTab;
import com.hgzy.service.BusTabService;

public class BusTabServiceImpl implements BusTabService{
	private BusTabDAOImpl busDao;

	public void setBusDao(BusTabDAOImpl busDao) {
		this.busDao = busDao;
	}
	
	public List<BusTab> findAllBus(){
		return busDao.findAll();
	}
}
