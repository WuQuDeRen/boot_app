package com.fj.boot.app;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fj.boot.app.domain.PersonDO;

@RestController
public class TestController {

	@RequestMapping(value = "/test/{id}")
	public String test(@ModelAttribute("id") Integer id) {
		if (id == 1) {
			throw new RuntimeException("入参1");
		}
		return "aaa";
	}
	
	@RequestMapping(value = "/test/body")
	public String getBody(@RequestBody PersonDO person) {
		return "....";
	}
}
