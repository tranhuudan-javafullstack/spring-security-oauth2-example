package com.huudan.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huudan.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
