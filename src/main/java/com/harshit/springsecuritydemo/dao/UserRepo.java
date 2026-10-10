package com.harshit.springsecuritydemo.dao;

import com.harshit.springsecuritydemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
