package com.app.service;

import java.util.List;

import com.app.model.User;

public interface IUserService {


	public int save(User u);
	public int update(User u);
	public int delete(User u);
	
	public List<User> getAllUsers();
	public User getUserById(int id);
}
