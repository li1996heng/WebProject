package com.hgzy.action;

import java.util.List;

import com.hgzy.entity.CourseTab;
import com.hgzy.service.CourseTabService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 课程表的CRUD操作
 * @author 李恒
 *
 */
public class CourseAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private CourseTabService courseService;
	private Integer uid;


	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public void setCourseService(CourseTabService courseService) {
		this.courseService = courseService;
	}
	
	/**
	 * 通过登录的用户ID 查询该用户的课程表信息
	 * @return
	 */
	public String list(){
		List<CourseTab> courses = courseService.findCourseTabByUserId(uid);
		ActionContext.getContext().put("courses", courses);
		return "listsuccess";
	}
}
