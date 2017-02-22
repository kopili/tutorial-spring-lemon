package com.naturalprogramming.spring.lemon.mvc.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.naturalprogrammer.spring.lemon.domain.AbstractUser;

@Entity
@Table(name = "usr")
public class User extends AbstractUser<User, Long> {
	private static final long serialVersionUID = 2716710947175132319L;

	public static final int NAME_MIN = 1;
	public static final int NAME_MAX = 50;
	@NotBlank(message = "{blank.name}", groups = { SignUpValidation.class, UpdateValidation.class })
	@Size(min = NAME_MIN, max = NAME_MAX, groups = { SignUpValidation.class, UpdateValidation.class })
	@Column(nullable = false, length = NAME_MAX)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}