package com.hgzy.action;

import com.hgzy.entity.LibraryTab;
import com.hgzy.service.LibraryTabService;
import com.hgzy.util.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 图书表的CRUD操作
 * @author 李恒
 *
 */
public class LibraryAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private LibraryTabService libraryService;
	private String input;
	private Integer currPage = 1;

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public void setLibraryService(LibraryTabService libraryService) {
		this.libraryService = libraryService;
	}
	
	public String list(){
		PageBean<LibraryTab> pageBean = libraryService.findAllLibraryByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "listsuccess";
	}
	
	public String like(){
		System.out.println("input的值为："+input);
		ActionContext.getContext().put("list", libraryService.findLibraryByLike(input));
		return "likesuccess";
	}
}
