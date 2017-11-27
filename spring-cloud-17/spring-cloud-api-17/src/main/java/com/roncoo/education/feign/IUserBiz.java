package com.roncoo.education.feign;
import org.springframework.cloud.netflix.feign.FeignClient;

import com.roncoo.education.feign.configuration.RcFeignConfiguration;
import com.roncoo.education.feign.fallback.RcFeignFallback;
import com.roncoo.education.service.UserService;

/**
 * @author wujing
 */
@FeignClient(value = "spring-cloud-provider", configuration = RcFeignConfiguration.class, fallback = RcFeignFallback.class)
public interface IUserBiz extends UserService{
	
	// @RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
	// String view1(@PathVariable(name = "id") int id);
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
