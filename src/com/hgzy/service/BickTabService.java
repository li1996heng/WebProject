package com.hgzy.service;

import java.util.List;

import com.hgzy.entity.BickTab;
import com.hgzy.entity.LibraryTab;

public interface BickTabService {
	public List<BickTab> findAllBick();
	public List<BickTab> findBickByLike(String key);
}
