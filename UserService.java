package com.indrayani.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indrayani.entity.UserEntity;
import com.indrayani.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserEntity addUser(UserEntity userEntity) {
		return userRepository.save(userEntity);
	}

	public List<UserEntity> getUserData() {
		return userRepository.findAll();
	}

	public Optional<UserEntity> findByID(Long id) {
		return userRepository.findById(id);

	}

	public UserEntity updateUserById(Long id, UserEntity userEntity) {

		boolean isExist = userRepository.existsById(id);
		if (isExist) {
			userEntity.setId(id);
			return userRepository.save(userEntity);
		} else {
			return null;
		}

	}

	public void save(UserEntity userEntity) {
	}
	
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}
}
