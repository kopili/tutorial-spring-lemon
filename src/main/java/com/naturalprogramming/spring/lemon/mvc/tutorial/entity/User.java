package com.naturalprogramming.spring.lemon.mvc.tutorial.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.naturalprogrammer.spring.lemon.domain.AbstractUser;

@Entity
@Table(name = "usr")
public class User extends AbstractUser<User, Long> {
	private static final long serialVersionUID = 2716710947175132319L;

}