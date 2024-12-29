package com.huudan.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huudan.springcloud.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
