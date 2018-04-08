package com.app.dao;

import java.util.List;

import com.app.model.User;

public interface IUserDao {

	public int save(User u);
	public int update(User u);
	public int delete(User u);
	
	public List<User> getAllUsers();
	public User getUserById(int id);
}
