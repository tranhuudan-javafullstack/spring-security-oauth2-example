package com.huudan.springcloud.security.repos;

import com.huudan.springcloud.security.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
