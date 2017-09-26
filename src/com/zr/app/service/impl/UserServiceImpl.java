package com.zr.app.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.zr.app.dao.UserDao;
import com.zr.app.domain.User;
import com.zr.app.service.UserService;
@Transactional
public class UserServiceImpl implements UserService{
	private UserDao userdao;
	

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}


	@Override
	public boolean add(User user) {
		return this.userdao.add(user);
	}


	@Override
	public boolean find(String username, String password) {
		
		if(this.userdao.find(username, password)!=null){
			return true;
		}
		return false;
	}


	

}
