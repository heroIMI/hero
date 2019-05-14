package com.service;

import java.util.List;

import com.entry.User;

public interface UserService<T> {
public List<User>queryAll();

public void add(String str);
public void update(String str,String id);
public void delete(Integer id);
}
