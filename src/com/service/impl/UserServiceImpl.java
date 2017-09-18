package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.model.Guan;
import com.model.Guan1;
import com.model.User;
import com.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	@Autowired
	UserMapper userMapper;
	private int result;
	@Override
	/*
	public boolean checkUser(User user) {
		List<User> list = userMapper.findUserByUsername(user);
		System.out.println("size : " + list.size());
		if(list.isEmpty()){
			return true;
		}
		return false;
	}*/
	public boolean add(User user) {
	result = userMapper.save(user);
	if (result > 0) 
	{
	return true;
	}	
	return false;
	}
	@Override
	public boolean add1(Guan1 guan1) {
		result = userMapper.save1(guan1);
		if (result > 0) 
		{
		return true;
		}	
		return false;
		}

	@Override
	public boolean delete(int id) {
	result = userMapper.delete(id);
	if (result > 0) 
	{
	return true;
	}	
	return false;
	}

	@Override
	public boolean update(User user) {
	result = userMapper.update(user);
	if (result > 0) 
	{
	return true;
	}	
	return false;
	}

	@Override
	public List<User> queryAll(){
		List<User> users = userMapper.getUsers();
		return users;
	}
	@Override
	public int cun(Guan guan) {
	result = userMapper.getcun(guan);
	if (result > 0) 
	{
		result = userMapper.getGuan(guan);
		if (result==1) 
		{
		return 1;
		}	
		if(result==2){
		return 2;
		}
	}	
	
	return 0;
}
	/*@Override
	public int checkGuan(Guan guan) {
		result = userMapper.getGuan(guan);
		if (result==1) 
		{
		return 1;
		}	
		if(result==2){
		return 2;
		}
		else
			return 0;

    }*/
	
}
