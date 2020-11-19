package com.flyer.service;

import java.util.List;

import com.flyer.model.User;

public interface UserService {

	public List<User> getAllUsers();

	public User getUserById(int id);
	
	public User addUser(User u);

	public User modifyUser(User u);

	public void deleteUser(int id);
	
}
