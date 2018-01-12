package com.test.service;

import com.test.dao.TestDao;

public class TestService {
 private TestDao testDao= new TestDao();
 public String m1(){
	 System.out.println("SERVICE");
	 return testDao.m1();
 }
}
