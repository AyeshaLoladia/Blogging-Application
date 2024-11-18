package com.ayesha.blog.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ayesha.blog.entities.User;
import com.ayesha.blog.payloads.UserDTO;
import com.ayesha.blog.repositories.UserRepo;
import com.ayesha.blog.services.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDTO crateUser(UserDTO userDto) {
		
		User user = this.DtoToUser(userDto);
		User savedUser = this.userRepo.save(user);
		
		
		return this.UserToDto(savedUser);
	}

	@Override
	public UserDTO updateUser(UserDTO user, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getUserById(UserDTO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDTO> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer UserId) {
		// TODO Auto-generated method stub

	}
	
	private User DtoToUser(UserDTO userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setAbout(userDto.getAbout());
		user.setPassword(userDto.getPassword());
		return user;
	}
	
	private UserDTO UserToDto(User user) {
		UserDTO userDto = new UserDTO();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setAbout(user.getAbout());
		userDto.setPassword(user.getPassword());
		return userDto;
	}
	

}
