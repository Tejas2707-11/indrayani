package com.indrayani.controller;

import com.indrayani.entity.UserEntity;
import com.indrayani.service.UserService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public UserEntity addUser(@RequestBody UserEntity userEntity) {
		userService.addUser(userEntity);
		return userEntity;
	}

	@GetMapping
	public List<UserEntity> getUserData() {
		List<UserEntity> userEntity = userService.getUserData();
		return userEntity;
	}

	@GetMapping("/{id}")
	public UserEntity getUserByID(@PathVariable Long id) {
		UserEntity userEntity = userService.findByID(id).get();
		return userEntity;
	}

	@PutMapping("/{id}")
	public ResponseEntity<UserEntity> updateUserById(@PathVariable Long id, @RequestBody UserEntity userEntity) {
		UserEntity userEntity1 = userService.updateUserById(id, userEntity);
		if (userEntity1 != null) {
			return ResponseEntity.ok(userEntity1);

		} else {
			return ResponseEntity.notFound().build();
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<UserEntity> deleteUserById(@PathVariable Long id) {
		userService.deleteUserById(id);
		return ResponseEntity.noContent().build();
	}

}
