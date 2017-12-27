package com.roncoo.education.controller;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.roncoo.education.bean.User;

/**
 * @author wujing
 */
@RestController
@RequestMapping(value = "/api/user")
public class ApiUserController {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User view(@PathVariable int id) {
		User user = new User();
		user.setId(id);
		user.setName("无境4");
		user.setCreateTime(new Date());
		logger.info("请求接口返回：{}", user);
		return user;
	}

}
