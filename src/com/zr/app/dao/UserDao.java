package com.zr.app.dao;

import java.util.List;

import com.zr.app.domain.User;

public interface UserDao {
	public boolean add(User user);
	public User find(String username,String password);

}
