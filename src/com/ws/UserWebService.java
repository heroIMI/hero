package com.ws;

import java.util.List;

import javax.jws.WebService;

import com.entry.User;

@WebService
public interface UserWebService {
public List<User>queryAll();
	public void add(String str);
	public void update(String str,String id);
	public void delete(Integer id);
}

