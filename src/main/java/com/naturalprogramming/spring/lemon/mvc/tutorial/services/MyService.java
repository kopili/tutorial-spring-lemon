package com.naturalprogramming.spring.lemon.mvc.tutorial.services;

import org.springframework.stereotype.Service;

import com.naturalprogrammer.spring.lemon.LemonService;
import com.naturalprogramming.spring.lemon.mvc.tutorial.entity.User;

@Service
public class MyService extends LemonService<User, Long> {
	@Override
	protected User newUser() {
		return new User();
	}
}