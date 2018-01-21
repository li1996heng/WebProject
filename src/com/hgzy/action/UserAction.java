package com.hgzy.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.hgzy.entity.UserTab;
import com.hgzy.service.UserTabService;
import com.hgzy.util.UUIDUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 处理用户登录和注册模块的Action
 * @author 李恒
 *
 */
public class UserAction extends ActionSupport  implements ModelDriven<UserTab>{
	private static final long serialVersionUID = 1L;
	private UserTab model;
	private String code;
	private Integer id;
	private UserTabService userService;
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setUserService(UserTabService userService) {
		this.userService = userService;
	}
	
	/*
	 * 用户登录
	 */
	public String login(){
		UserTab user = userService.findUserByNameAndPwd(model);
		//当用户存在并且激活状态为1 的时候才允许用户登录
		if (user != null && user.getState() == 1) {
			ActionContext.getContext().getSession().put("user", user);
			//获取当前系统时间
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			//存入application对象 方便用户查询上一次登录时间
			ServletActionContext.getServletContext().setAttribute("time", sdf.format(date));
			//如用户登录成功清除session对象中的提示信息
			ActionContext.getContext().getSession().put("error","");
			return "loginsuccess";
		}else{
			ActionContext.getContext().getSession().put("error","用户名或密码错误");
			return INPUT;
		}
		
	}
	
	
	//用户注册
	public String register(){
		//1.得到用户输入的注册信息
		String username = model.getUsername();
		String pwd = model.getPwd();
		String email = model.getEmail();
		
		//2.封装数据
		UserTab u = new UserTab();
		u.setUsername(username);
		u.setPwd(pwd);
		u.setEmail(email);
		u.setState(0);	//0表示未激活  1表示激活
		code = UUIDUtil.getUUID()+UUIDUtil.getUUID();//生成64位随机字符串
		u.setCode(code);
		
		//保存数据
		userService.addUser(u);
		
		
		return "register";
	}
	
	//激活账户
	public String active(){
		UserTab userTab = new UserTab();
		userTab = userService.findUserByCode(code);
		if(userTab != null){
			//已经 查询到用户  修改用户的状态
			userTab.setState(1);
			userTab.setCode(null);
			userService.updateUserTab(userTab);
			return "welcome";
		}else{
			return "fail";
		}
		
	}
	
	
	//修改密码
	public String edit(){
		ActionContext.getContext().put("user", userService.findUserById(id));
		return "editsuccess";
	}
	
	
	public String update(){
		userService.updateUserTab(model);
		return "updatesuccess";
	}

	public UserTab getModel() {
		if (model == null) {
			model = new UserTab();
		}
		return model;
	}
}
