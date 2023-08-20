package com.example.user.service.services;

import java.util.List;

import com.example.user.service.entities.User;

public interface UserService {
	
	User getUser(String userId);
	
	List<User> getAllUser();
	
	User saveUser(User user);

}
