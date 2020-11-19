package com.flyer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flyer.model.User;
import com.flyer.service.UserService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return service.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id){
		return service.getUserById(id);
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User u) {
		return service.addUser(u);
	}
	
	@PutMapping("/users")
	public User modifyUser(@RequestBody User u) {
		return service.modifyUser(u);
	}
	
	@GetMapping("/users/afterDelete/{id}")
	public List<User> deleteUser(@PathVariable int id){
		service.deleteUser(id);
		return service.getAllUsers();
	}
	
}