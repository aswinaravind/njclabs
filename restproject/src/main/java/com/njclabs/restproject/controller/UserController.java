package com.njclabs.restproject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.njclabs.restproject.dao.UserDAO;
import com.njclabs.restproject.dto.UserDTO;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserDAO userDAO;
	
	@PostMapping("/create")
	UserDTO createUser(@RequestBody UserDTO dto) {
		return userDAO.save(dto);
		
	}
	
	@GetMapping("/user/{id}")
	Optional<UserDTO> getUser(@PathVariable String id ) {
		return userDAO.findById(id);
		
	}
	

}
