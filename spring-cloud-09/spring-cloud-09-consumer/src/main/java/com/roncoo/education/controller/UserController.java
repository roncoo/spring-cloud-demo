
package com.roncoo.education.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wujing
 */
@RestController
@RequestMapping(value = "/user", method = RequestMethod.POST)
public class UserController {

	//private static final String URL="http://localhost:7777/api/user/{id}";
	private static final String URL="http://spring-cloud-provider/api/user/{id}";
	private static final String URL2="http://spring-cloud-provider2/api/user/{id}";

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String get(@PathVariable(value = "id") int id) {
		return restTemplate.getForObject(URL, String.class, id);
	}
	
	@RequestMapping(value = "/2/{id}", method = RequestMethod.GET)
	public String get2(@PathVariable(value = "id") int id) {
		return restTemplate.getForObject(URL2, String.class, id);
	}
	

}
