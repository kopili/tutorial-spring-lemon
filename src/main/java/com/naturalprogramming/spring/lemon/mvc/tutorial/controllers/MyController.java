package com.naturalprogramming.spring.lemon.mvc.tutorial.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naturalprogrammer.spring.lemon.LemonController;
import com.naturalprogramming.spring.lemon.mvc.tutorial.entity.User;

@RestController
@RequestMapping("/api/core")
public class MyController extends LemonController<User, Long> {

}
