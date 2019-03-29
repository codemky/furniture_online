package com.web.controller;

import com.web.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	/**测试网站首页
	 * @return
	 */


	@Autowired
	TestService service;


	@RequestMapping("/test")
	public String test() {
		System.out.println("----------------------测试----------------------");
		service.test();
		return "index";
	}
	
}
