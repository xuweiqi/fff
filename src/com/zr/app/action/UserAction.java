package com.zr.app.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zr.app.domain.User;
import com.zr.app.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	private User user=new User();
	private String nextPage;
	private UserService userservice;

	public String getNextPage() {
		return nextPage;
	}
	public void setNextPage(String nextPage) {
		this.nextPage = nextPage;
	}
	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}
	public String add(){
		boolean user1=userservice.add(user);
		if(user1){
			this.nextPage="login.jsp";
			return SUCCESS;
		}
		this.nextPage="register.jsp";
		return "fail";
	}
 
	public String login(){
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		boolean uu=userservice.find(user.getUsername(), user.getPassword());
		System.out.println(uu);
		if(uu){
			this.nextPage="index.jsp";
			return "login";
		}else{
			this.nextPage="login.jps";
			return "loginbai";
		}
		
		
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
