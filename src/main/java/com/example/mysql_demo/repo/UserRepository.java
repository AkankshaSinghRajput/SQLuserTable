package com.example.mysql_demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysql_demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}