package com.fj.boot.app;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value = "/test/{id}")
	public String test(@ModelAttribute("id") Integer id) {
		if (id == 1) {
			throw new RuntimeException("入参1");
		}
		return "aaa";
	}
}
