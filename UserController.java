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
	public ResponseEntity<UserEntity> addUser(@RequestBody UserEntity userEntity) {
		UserEntity userEntityObj = userService.addUser(userEntity);
		return new ResponseEntity<>(userEntityObj, HttpStatus.CREATED);

	}

	@GetMapping
	public ResponseEntity<List<UserEntity>> getUsers() {
		List<UserEntity> userEntities = userService.getUserData();
		return new ResponseEntity<>(userEntities, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<UserEntity> getUserById(@PathVariable Long id) {
		UserEntity userEntity = userService.findByID(id).get();
		return new ResponseEntity<>(userEntity, HttpStatus.OK);
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
