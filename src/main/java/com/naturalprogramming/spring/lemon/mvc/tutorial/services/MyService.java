package com.naturalprogramming.spring.lemon.mvc.tutorial.services;

import org.springframework.stereotype.Service;

import com.naturalprogrammer.spring.lemon.LemonService;
import com.naturalprogrammer.spring.lemon.util.LemonUtil;
import com.naturalprogramming.spring.lemon.mvc.tutorial.entity.User;

@Service
public class MyService extends LemonService<User, Long> {
	@Override
	protected User newUser() {
		return new User();
	}

	@Override
	protected void updateUserFields(User user, User updatedUser, User currentUser) {
		super.updateUserFields(user, updatedUser, currentUser);
		user.setName(updatedUser.getName());
		LemonUtil.afterCommit(() -> {
			if (currentUser.equals(user))
				currentUser.setName(user.getName());
		});
	}

	@Override
	protected User createAdminUser() {
		User user = super.createAdminUser();
		user.setName("Administrator");
		return user;
	}

	@Override
	protected User userForClient(User currentUser) {
		User user = super.userForClient(currentUser);
		if (user != null)
			user.setName(currentUser.getName());
		return user;
	}

}