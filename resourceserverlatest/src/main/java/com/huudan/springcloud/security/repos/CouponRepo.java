package com.huudan.springcloud.security.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huudan.springcloud.security.entities.Coupon;


public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
