package com.jcommerce.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jcommerce.app.model.User;
import com.jcommerce.app.service.IUserService;


@RestController
public class UserController 
{
	@Autowired
	private IUserService iUserService;
	
	@RequestMapping(method=RequestMethod.POST, value="/loginuser")
	@ResponseBody
	public List<User> addUser()
	{
		return null;
	}
}
