package com.ayesha.blog.services;

import java.util.List;

import com.ayesha.blog.payloads.UserDTO;

public interface UserService {

	UserDTO crateUser(UserDTO user);
	UserDTO updateUser(UserDTO user, Integer userId);
	UserDTO getUserById(UserDTO user);
	List<UserDTO> getAllUsers();
	void deleteUser(Integer UserId);
}
