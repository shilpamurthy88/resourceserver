package com.sapient.project.resourceserver.controller;

import com.sapient.project.resourceserver.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired
	UserRepository userRepository;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ResponseEntity<Object> getListOfUsers() {
		return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
	}

}
