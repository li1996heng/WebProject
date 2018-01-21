package com.hgzy.service.Impl;

import java.util.List;

import com.hgzy.dao.Impl.ClassroomTabDAOImpl;
import com.hgzy.entity.ClassroomTab;
import com.hgzy.entity.LibraryTab;
import com.hgzy.service.ClassroomTabService;
import com.hgzy.util.PageBean;

public class ClassroomTabServiceImpl implements ClassroomTabService{
	private ClassroomTabDAOImpl classroomDao;

	public void setClassroomDao(ClassroomTabDAOImpl classroomDao) {
		this.classroomDao = classroomDao;
	}
	public List<ClassroomTab> findAllClassroom(){
		return classroomDao.findAll();
	}
	public PageBean<ClassroomTab> findAllLibraryByPage(Integer currPage) {
		PageBean<ClassroomTab> pageBean = new PageBean<ClassroomTab>();
		//封装当前页数
		pageBean.setCurrPage(currPage);
		//封装每页显示的记录数
		int pageSize = 10;	//每页显示10条
		pageBean.setPageSize(pageSize);
		//封装总记录数
		int totalCount = classroomDao.findCount();
		pageBean.setTotalCount(totalCount);
		//封装总页数    总页数 = 总记录数/每页显示的记录数  
		double tc = totalCount;
		Double num = Math.ceil(tc/pageSize);	//向上取整
		pageBean.setTotalPage(num.intValue());
		//封装每页显示的数据
		int begin = (currPage - 1)*pageSize;
		List<ClassroomTab> list = classroomDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}
	
	/**
	 * 业务层实现根据某一字段模糊查询教室信息
	 */
	public List<ClassroomTab> findClassroomByLike(String key) {
		return classroomDao.findClassroomByLike(key);
	}
	
}
