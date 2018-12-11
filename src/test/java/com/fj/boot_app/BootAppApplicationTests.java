package com.fj.boot_app;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.fj.boot.app.dao.PersonDao;
import com.fj.boot.app.domain.PersonDO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootAppApplicationTests {

	@Value("${jdbc.url}")
	private String jdbcUrl;
	
	@Autowired
	private PersonDao personDao;

	@Test
	public void contextLoads() {
		
	}

	@Test
	public void test() {
		int a = 23;
		List<PersonDO> personList = personDao.query();
		System.out.println(personList);
		List<PersonDO> testList = personDao.query();

	}
	
	
	public static void main(String[] args) {
		AtomicBoolean active = new AtomicBoolean();
		System.out.println(JSON.toJSONString(active.get()));
	}

}
