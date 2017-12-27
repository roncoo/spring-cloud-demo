package com.roncoo.education.bean.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.roncoo.education.bean.User;

public interface UserService {

	@RequestMapping(method = RequestMethod.GET, value = "/api/user/find/{id}")
	User find(@PathVariable(value = "id") int id);
}
