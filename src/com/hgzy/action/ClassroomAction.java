package com.hgzy.action;

import com.hgzy.entity.ClassroomTab;
import com.hgzy.service.ClassroomTabService;
import com.hgzy.util.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 教室表的CRUD操作
 * @author 李恒
 *
 */
public class ClassroomAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private ClassroomTabService classroomService;
	private Integer currPage = 1;
	private String input;
	
	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	public void setClassroomService(ClassroomTabService classroomService) {
		this.classroomService = classroomService;
	}

	public String list(){
		PageBean<ClassroomTab> pageBean = classroomService.findAllLibraryByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "listsuccess";
	}
	
	public String like(){
		ActionContext.getContext().put("list", classroomService.findClassroomByLike(input));
		return "likesuccess";
	}
}
