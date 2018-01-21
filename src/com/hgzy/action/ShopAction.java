package com.hgzy.action;

import com.hgzy.service.ShopTabService;
import com.hgzy.service.Impl.ShopTabServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 店铺表的CRUD操作
 * @author 李恒
 *
 */
public class ShopAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private ShopTabService shopService;

	public void setShopService(ShopTabService shopService) {
		this.shopService = shopService;
	}
	
	public String add() {
		ActionContext.getContext().put("shops", shopService.findAllShop());
		return "addsuccess";
	}
}
