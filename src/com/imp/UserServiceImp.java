package com.imp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entry.User;
import com.service.UserService;
import com.ws.UserWebService;

@Service
public class UserServiceImp implements UserService<User>{
	@Autowired 
	private UserWebService userWebService;

	@Override
	public List<User> queryAll() {
		List<User> stuList = userWebService.queryAll();
		return stuList;
	}

@Override
public void add(String str) {
	userWebService.add(str);
}
@Override
public void update(String str,String id) {
	userWebService.update(str,id);
}
@Override
public void delete(Integer id) {
	userWebService.delete(id);
}
}
