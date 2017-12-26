package com.roncoo.education.feign;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.roncoo.education.bean.User;
import com.roncoo.education.bean.service.UserService;
import com.roncoo.education.feign.configuration.RcFeignConfiguration;

import feign.Param;
import feign.RequestLine;

/**
 * @author wujing
 */
@FeignClient(value = "spring-cloud-provider", configuration = RcFeignConfiguration.class)
public interface IUserBiz extends UserService{
	
	@RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
	String view1(@PathVariable(name = "id") int id);
	//说明：method需要指定
	
	//@RequestLine("GET /api/user/{id}")
	//String view1(@Param(value = "id") int id);

	//@GetMapping(value = "/api/user/{id}")
	//String view1(@PathVariable(name = "id") int id);

	
	// 不支持该方式传值，启动出错。
	//@RequestMapping(value = "/api/user/get/{id}", method = RequestMethod.GET)
	//User get3(@PathVariable(value = "id") int id, @RequestParam String name);

	/*@RequestMapping(value = "/api/user/get/{id}", method = RequestMethod.GET)
	User get4(@PathVariable(value = "id") int id, @RequestParam Map<String, Object> name);

	@RequestMapping(value = "/api/user/get/{id}", method = RequestMethod.GET)
	User get5(@PathVariable(value = "id") int id, @RequestParam(value = "name") String name);

	@RequestMapping(value = "/api/user/get/{id}", method = RequestMethod.GET)
	User get1(@PathVariable(value = "id") int id, String name);
	
	@RequestMapping(value = "/api/user/get/{id}", method = RequestMethod.GET)
	User get2(@PathVariable(value = "id") int id, Map<String, Object> name);

	@RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
	User view(@PathVariable(value = "id") int id);
	
	//@RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
	//String view1(@PathVariable(value = "id") int id);
	
	@RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
	Map<String, Object> view2(@PathVariable(value = "id") int id);*/

}
