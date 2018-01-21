package com.hgzy.action;


import com.hgzy.entity.FoodTab;
import com.hgzy.service.FoodTabService;
import com.hgzy.service.ShopTabService;
import com.hgzy.util.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 商品表的CRUD操作
 * @author 李恒
 *
 */
public class FoodAction extends ActionSupport implements ModelDriven<FoodTab>{
	private static final long serialVersionUID = 1L;
	private FoodTabService foodService;
	private ShopTabService shopService;
	private Integer id;
	private String input;
	private FoodTab model;
	//当前页数
	private Integer currPage = 1;
	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}
	
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setShopService(ShopTabService shopService) {
		this.shopService = shopService;
	}

	public void setFoodService(FoodTabService foodService) {
		this.foodService = foodService;
	}
	
	/**
	 * 分页显示商品
	 * @return
	 */
	public String list(){
		PageBean<FoodTab> pageBean = foodService.findAllFoodByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "listsuccess";
	}
	
	public String like(){
		ActionContext.getContext().put("list", foodService.findFoodByLike(input));
		return "likesuccess";
	}
	
	/**
	 * 添加商品之前把店铺名传入到相应的JSP页面
	 */
	public String input(){
		ActionContext.getContext().put("shops", shopService.findAllShop());
		return "inputsuccess";
	}
	
	/**
	 * 添加商品
	 * @return
	 */
	public String add() {
		foodService.addFood(model);
		return "addsuccess";
	}
	
	/**
	 * 删除商品
	 * @return
	 */
	public String delete(){
		foodService.deleteFood(id);
		return "addsuccess";
	}
	
	public String edit(){
		model = foodService.findFoodById(id);
		System.out.println("-------edit方法执行成功！ ");
		System.out.println(id);
		System.out.println("--------------------------s");
		ActionContext.getContext().put("shops", shopService.findAllShop());
		ActionContext.getContext().put("model", model);
		return "editsuccess";
	}
	
	/**
	 * 修改商品
	 * @return
	 */
	public String update() {
		foodService.updateFood(model);
		return "updatesuccess";
	}
	
	public FoodTab getModel() {
		if (model == null) {
			model = new FoodTab();
		}
		return model;
	}
}
