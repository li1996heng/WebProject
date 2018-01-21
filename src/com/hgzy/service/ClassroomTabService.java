package com.hgzy.service;

import java.util.List;

import com.hgzy.entity.ClassroomTab;
import com.hgzy.util.PageBean;

public interface ClassroomTabService {
	public List<ClassroomTab> findAllClassroom();
	public List<ClassroomTab> findClassroomByLike(String key);
	public PageBean<ClassroomTab> findAllLibraryByPage(Integer currPage);
}
