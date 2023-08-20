package com.example.user.service.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.service.entities.User;
import com.example.user.service.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping(value = "/users")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		User user1=userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	@GetMapping(value = "/users")
	public ResponseEntity<List<User>> getAllUser(){
		List<User> users=userService.getAllUser();
		return ResponseEntity.status(HttpStatus.CREATED).body(users);
	}
	
	@GetMapping("users/{userId}")
	public ResponseEntity<User> getUser(@PathVariable String userId){
		User user=userService.getUser(userId);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}
}
