package com.hgzy.service.Impl;

import java.util.List;

import com.hgzy.dao.Impl.LibraryTabDAOImpl;
import com.hgzy.entity.FoodTab;
import com.hgzy.entity.LibraryTab;
import com.hgzy.service.LibraryTabService;
import com.hgzy.util.PageBean;

public class LibraryTabServiceImpl implements LibraryTabService{
	private LibraryTabDAOImpl libraryDao;

	public void setLibraryDao(LibraryTabDAOImpl libraryDao) {
		this.libraryDao = libraryDao;
	}
	
	public List<LibraryTab> findAllLibrary(){
		return libraryDao.findAll();
	}
	
	/**
	 * 业务层实现根据某一字段模糊查询图书对象  
	 */
	public List<LibraryTab> findLibraryByLike(String key){
		return libraryDao.findLibraryByLike(key);
	}
	
	/**
	 * 业务层实现分页查询的功能
	 * @param currPage
	 * @return
	 */
	public PageBean<LibraryTab> findAllLibraryByPage(Integer currPage){
		PageBean<LibraryTab> pageBean = new PageBean<LibraryTab>();
		//封装当前页数
		pageBean.setCurrPage(currPage);
		//封装每页显示的记录数
		int pageSize = 10;	//每页显示10条
		pageBean.setPageSize(pageSize);
		//封装总记录数
		int totalCount = libraryDao.findCount();
		pageBean.setTotalCount(totalCount);
		//封装总页数    总页数 = 总记录数/每页显示的记录数  
		double tc = totalCount;
		Double num = Math.ceil(tc/pageSize);	//向上取整
		pageBean.setTotalPage(num.intValue());
		//封装每页显示的数据
		int begin = (currPage - 1)*pageSize;
		List<LibraryTab> list = libraryDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}
}
