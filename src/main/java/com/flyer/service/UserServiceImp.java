package com.flyer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyer.model.User;
import com.flyer.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserRepository repo;
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		Optional<User> user = repo.findById(id);
		return user.get();
	}
	
	@Override
	public User addUser(User u) {
		// TODO Auto-generated method stub
		return repo.save(u);
	}

	@Override
	public User modifyUser(User u) {
		// TODO Auto-generated method stub
		Optional<User> user1 = repo.findById(u.getId());
		User user = user1.get();
		user.setFirstName(u.getFirstName());
		user.setLastName(u.getLastName());
		user.setUserName(u.getUserName());
		user.setPassword(u.getPassword());
		return repo.save(user);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}

