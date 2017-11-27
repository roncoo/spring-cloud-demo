package com.roncoo.education.feign.fallback;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.roncoo.education.bean.User;
import com.roncoo.education.feign.IUserBiz;

@Component
public class RcFeignFallback implements IUserBiz {
	@Override
	public User find(int id) {
		System.out.println("断路器");
		User user = new User();
		user.setId(id);
		user.setName("断路器");
		user.setCreateTime(new Date());
		return user;
	}
	

}
