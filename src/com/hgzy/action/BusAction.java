package com.hgzy.action;

import com.hgzy.service.Impl.BusTabServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 公交车表的CRUD操作
 * @author 李恒
 *
 */
public class BusAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private BusTabServiceImpl busService;

	public void setBusService(BusTabServiceImpl busService) {
		this.busService = busService;
	}
	
	public String list(){
		ActionContext.getContext().put("bus", busService.findAllBus());
		return "listsuccess";
	}
}
