package com.czq.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	/**
	 * 访问 localhost:8080/工程名/123
	 * 跳转到view/index.jsp
	 * @return
	 */
	@RequestMapping("/123")
	public String reindex() {
		return "/index";
	}
}
