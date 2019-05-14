package com.controller;

import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.util.List;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.client.Client;
import org.codehaus.xfire.client.XFireProxy;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entry.User;
import com.service.UserService;
import com.ws.UserWebService;

@Controller
public class UserController {
@Autowired
private UserService<?> service;
@RequestMapping("list")
public String queryAll(Model model)  {
	List<User>list=service.queryAll();
	System.out.println(list);
	model.addAttribute("user",list);
	return "list";
}
@RequestMapping("/add")
public String add(String str)  {
	 service.add(str);
	return "forward:list";
}
@RequestMapping("/update")
public String update(String str,String id)  {
	service.update(str,id);
	return "forward:list";
}
@RequestMapping("/delete")
public String delete(String id)  {
	service.delete(Integer.parseInt(id));
	return "forward:list";
}
}
