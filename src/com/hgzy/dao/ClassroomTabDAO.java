package com.hgzy.dao;

import java.util.List;
import com.hgzy.entity.ClassroomTab;

public interface ClassroomTabDAO {
	public void save(ClassroomTab transientInstance) ;

	public void delete(ClassroomTab persistentInstance) ;

	public ClassroomTab findById(java.lang.Integer id);

	public List<ClassroomTab> findByExample(ClassroomTab instance);

	public List<ClassroomTab> findByProperty(String propertyName, Object value) ;

	public List<ClassroomTab> findAll();

	public ClassroomTab merge(ClassroomTab detachedInstance) ;

	public void attachDirty(ClassroomTab instance);

	public void attachClean(ClassroomTab instance) ;
	
	public int findCount();

	public List<ClassroomTab> findByPage(int begin, int pageSize);
	
	public List<ClassroomTab> findClassroomByLike(String key);
	
}
