package com.demo.spring;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestService {
	@RequestMapping(path = "/greet/{name}", method = RequestMethod.GET)
	public String greet(@PathVariable("name") String name) {
		return "Hello Service: " + name;
	}

	@RequestMapping(path = "/message", method = RequestMethod.GET)
	public String getMessage(@RequestParam("name") String name) {
		return "Query Param Service: " + name;
	}
	
	@RequestMapping(path = "/emp", method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Emp getEmp() {
		Emp e = new Emp(100, "Dev","Chn",100000000);
		return e;
	}
}
