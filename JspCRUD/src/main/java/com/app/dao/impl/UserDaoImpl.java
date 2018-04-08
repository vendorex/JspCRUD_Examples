package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.app.dao.IUserDao;
import com.app.model.User;
import com.app.util.ConnectionUtil;

public class UserDaoImpl implements IUserDao {

	
	
	public final String SAVE_USER = "insert into user(name,password,email,sex,country) values(?,?,?,?,?)";
	
	
	public int save(User u) {
		int status = 0;
		
		try{
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(SAVE_USER);
			ps.setString(1, u.getName());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getSex());
			ps.setString(5, u.getCountry());
			
			status = ps.executeUpdate();
			System.out.println("user Record successfully saved...");
		}catch(Exception e){
			
		}
		return status;
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
