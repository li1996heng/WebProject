package com.hgzy.service;

import java.util.List;

import com.hgzy.entity.LibraryTab;
import com.hgzy.util.PageBean;

public interface LibraryTabService {
	public List<LibraryTab> findAllLibrary();
	
	public List<LibraryTab> findLibraryByLike(String key);
	
	public PageBean<LibraryTab> findAllLibraryByPage(Integer currPage);
}
