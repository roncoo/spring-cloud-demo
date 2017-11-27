package com.roncoo.education.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.roncoo.education.bean.User;

/**
 * @author wujing
 */
@RestController
@RequestMapping(value = "/api/user")
public class ApiUserController {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/get/{id}")
	public User get(@PathVariable int id, @RequestBody(required = false) String json,
			@RequestParam(required = false) String name, HttpServletRequest request) {
		logger.info("请求方法类型：" + request.getMethod() + " RequestBody参数：" + json + " RequestParam参数：" + name);
		User user = new User();
		user.setId(id);
		user.setName("无境");
		user.setCreateTime(new Date());
		// logger.info("请求接口返回：{}", user);
		return user;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User view(@PathVariable int id, HttpServletRequest request) throws InterruptedException {
		//Thread.sleep(50000);
		User user = new User();
		user.setId(id);
		user.setName("无境1");
		user.setCreateTime(new Date());
		logger.info("请求接口返回：{}", user);
		
		System.out.println("通过zuul获取的token=" + request.getHeader("token"));
		return user;
	}
	
	@RequestMapping(value = "/upload")
	public String upload(@RequestParam(value = "file") MultipartFile file) throws IOException {
		File out = new File("D:/" + file.getOriginalFilename());
		FileCopyUtils.copy(file.getBytes(), out);
		return "sucess";
	}


}
