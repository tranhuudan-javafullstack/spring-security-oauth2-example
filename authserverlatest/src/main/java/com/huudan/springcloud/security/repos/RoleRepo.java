package com.huudan.springcloud.security.repos;

import com.huudan.springcloud.security.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepo extends JpaRepository<Role, Long> {

}
