package com.app.service.impl;

import java.util.List;

import com.app.dao.IUserDao;
import com.app.model.User;
import com.app.service.IUserService;

public class UserServiceImpl implements IUserService {

	private IUserDao dao;
	public int save(User u) {
		return dao.save(u);
	}

	public int update(User u) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(User u) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
