package com.fj.boot.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fj.boot.app.dao.PersonDao;
import com.fj.boot.app.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDao personDao;

	@Override
	public Object query(Integer param) {
		if (param == 1) {
			return personDao.query();
		}
		return personDao.queryInt();
	}

}
