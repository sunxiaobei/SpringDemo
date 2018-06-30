package com.demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.IOP.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.bean.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/beans.xml" })
public class ConfigDaoTest {

	@Autowired
	protected Person american;
	
	@Test
	public void saveDataCenter() throws Exception {
		
		american.Speak();
	}

}
