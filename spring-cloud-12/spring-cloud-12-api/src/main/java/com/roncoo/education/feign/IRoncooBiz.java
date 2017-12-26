package com.roncoo.education.feign;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wujing
 */
@FeignClient(value = "roncoo", url = "www.roncoo.com")
public interface IRoncooBiz {
	
	@RequestMapping(value = "/{url}", method = RequestMethod.GET)
	String get(@PathVariable(name = "url") String url);

}
