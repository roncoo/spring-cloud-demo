package com.roncoo.education.feign.fallback;
import org.springframework.stereotype.Component;

import com.roncoo.education.bean.User;
import com.roncoo.education.feign.IUserBiz;

@Component
public class RcFeignFallback implements IUserBiz {
	@Override
	public User find(int id) {
		return null;
	}
	
	@Override
	public String view1(int id) {
		System.out.println("调用远程接口异常，返回自定义信息");
		return "system error";
	}
}
