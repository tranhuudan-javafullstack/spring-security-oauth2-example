package com.huudan.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huudan.springcloud.model.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

}
