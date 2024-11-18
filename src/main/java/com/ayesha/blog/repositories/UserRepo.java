package com.ayesha.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayesha.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
