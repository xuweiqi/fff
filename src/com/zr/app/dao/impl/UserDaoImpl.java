package com.zr.app.dao.impl;



import java.sql.ResultSet;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zr.app.dao.UserDao;
import com.zr.app.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public boolean add(User user) {
		this.getHibernateTemplate().save(user);
		return true;
	}

	@Override
	public User find(String username, String password) {
		User user=new User();
		//String hql="from user where username=? and password=?";
		List rs=  this.getHibernateTemplate().find("from User where username=?and password=?",new Object[]{username,password});
		if(rs.size()>0){
			return user;
		}else{
		  return null;
		}
	}
}
