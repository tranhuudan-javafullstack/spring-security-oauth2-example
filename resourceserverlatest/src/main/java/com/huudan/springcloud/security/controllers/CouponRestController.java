package com.huudan.springcloud.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huudan.springcloud.security.entities.Coupon;
import com.huudan.springcloud.security.repos.CouponRepo;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

    private final CouponRepo repo;

    public CouponRestController(CouponRepo repo) {
        this.repo = repo;
    }

    @PostMapping("/coupons")
    public Coupon create(@RequestBody Coupon coupon) {
        return repo.save(coupon);

    }

    @GetMapping("/coupons/{code}")
    public Coupon getCoupon(@PathVariable("code") String code) {
        return repo.findByCode(code);

    }
}
