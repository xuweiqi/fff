package com.zr.app.service;



import com.zr.app.domain.User;

public interface UserService {
	public boolean add(User user);
	public boolean  find(String username, String password);

}
