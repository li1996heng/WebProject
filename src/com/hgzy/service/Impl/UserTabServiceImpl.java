package com.hgzy.service.Impl;

import com.hgzy.dao.Impl.UserTabDAOImpl;
import com.hgzy.entity.UserTab;
import com.hgzy.service.UserTabService;
import com.hgzy.util.MailUtil;

public class UserTabServiceImpl implements UserTabService{
	private UserTabDAOImpl userDAO;

	public void setUserDAO(UserTabDAOImpl userDAO) {
		this.userDAO = userDAO;
	}



	public UserTab findUserByNameAndPwd(UserTab user){
		return userDAO.findUserByNameAndPwd(user);
	}
	
	
	/**
	 * 把用户输入的注册信息存入到数据库
	 * 并向用户的邮箱发送一条邮件
	 * @param user
	 */
	public void addUser(UserTab user){
		userDAO.save(user);
		//发送邮件
		new Thread(new MailUtil(user.getEmail(), user.getCode())).start();
	}
	
	
	/**
	 * 根据Code查询用户
	 * @param code
	 * @return
	 */
	public UserTab findUserByCode(String code) {
		return userDAO.findUserByCode(code);
	}
	
	public void updateUserTab(UserTab userTab){
		userDAO.attachDirty(userTab);
	}


	public UserTab findUserById(Integer id){
		return userDAO.findById(id);
	}

	/*public void update(String pwd, Integer id) {
		userDAO.update(pwd, id);
	}*/
	
	
}
