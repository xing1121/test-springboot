package com.sf.wdx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sf.wdx.dao.PersonDao;
import com.sf.wdx.domain.Person;
import com.sf.wdx.service.PersonService;

/**
 * 描述：PersonServiceImpl
 * @author 80002888
 * @date   2018年8月29日
 */
@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	@Transactional
	@Override
	public void insert(Person person){
		personDao.insert(person);
	}

	@Transactional
	@Override
	public void deleteById(Long id) {
		personDao.deleteById(id);
	}

	@Transactional
	@Override
	public void updateById(Person person) {
		personDao.updateById(person);
	}

	@Transactional(readOnly=true)
	@Override
	public Person selectById(Long id) {
		return personDao.selectById(id);
	}

}
