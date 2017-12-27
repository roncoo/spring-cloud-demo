package com.roncoo.education.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.roncoo.education.feign.IUserBiz;

/**
 * @author wujing
 */
@RestController
@RequestMapping(value = "/feign/user", method = RequestMethod.POST)
public class FeignUserController {

	@Autowired
	private IUserBiz userBiz;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String get(@PathVariable(value = "id") int id) {
		return userBiz.view(id);
	}
}
