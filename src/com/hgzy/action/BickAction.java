package com.hgzy.action;

import com.hgzy.service.BickTabService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 自行车表的CRUD操作
 * @author 李恒
 *
 */
public class BickAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private BickTabService bickService;
	private String input;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public void setBickService(BickTabService bickService) {
		this.bickService = bickService;
	}
	
	public String list(){
		ActionContext.getContext().put("bicks", bickService.findAllBick());
		return "listsuccess";
	}
	
	public String like(){
		ActionContext.getContext().put("bicks", bickService.findBickByLike(input));
		return "likesuccess";
	}
}
