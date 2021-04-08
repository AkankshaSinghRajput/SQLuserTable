package com.example.mysql_demo.service;

import java.util.List;
import java.util.Optional;

import com.example.mysql_demo.entity.User;

public interface IUserService {
	int save(User user);

	List<User> getUser();

	Optional<User> getUserById(Integer userId);

	void updateUser(User user);

	void deleteOrder(Integer userId);

}