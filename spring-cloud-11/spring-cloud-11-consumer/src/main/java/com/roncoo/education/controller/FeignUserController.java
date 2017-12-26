package com.roncoo.education.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.roncoo.education.bean.User;
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
		//System.out.println(userBiz.view(id));
		//System.out.println(userBiz.view1(id));
		//System.out.println(userBiz.view2(id));
		
		//String name = "测试1";
		//Map<String, Object> map  = new HashMap<>();
		//map.put("name", "测试2");
		//userBiz.get4(id, map);
		//userBiz.get5(id, name);
		
		return userBiz.view1(id);
	}
}
