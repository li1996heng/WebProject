package com.hgzy.action;

import com.hgzy.service.StoreTabService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 商品表的CRUD操作
 * @author 李恒
 *
 */
public class StoreAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private StoreTabService storeService;
	public void setStoreService(StoreTabService storeService) {
		this.storeService = storeService;
	}
	public String list(){
		ActionContext.getContext().put("store", storeService.findAStore());
		return "listsuccess";
	}
}
