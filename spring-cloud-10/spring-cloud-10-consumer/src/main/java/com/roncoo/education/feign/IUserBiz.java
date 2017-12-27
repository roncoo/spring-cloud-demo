package com.roncoo.education.feign;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wujing
 */
@FeignClient(value = "spring-cloud-provider")
public interface IUserBiz {
	/**
	 * @return
	 */
	@RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
	String view(@PathVariable(value = "id") int id);
}
