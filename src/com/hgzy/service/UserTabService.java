package com.hgzy.service;

import com.hgzy.entity.UserTab;
import com.hgzy.util.MailUtil;

public interface UserTabService {
	public UserTab findUserByNameAndPwd(UserTab user);
	
	public void addUser(UserTab user);

	public UserTab findUserByCode(String code);
	
	public void updateUserTab(UserTab userTab);
/*	public void update(String pwd,Integer id);*/
	
	public UserTab findUserById(Integer id);
	
}
