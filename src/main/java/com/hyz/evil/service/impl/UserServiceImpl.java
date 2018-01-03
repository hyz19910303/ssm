package com.hyz.evil.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyz.evil.bean.Question;
import com.hyz.evil.bean.User;
import com.hyz.evil.config.datasource.DynamicDataSourceHolder;
import com.hyz.evil.dao.UserDao;
import com.hyz.evil.service.UserService;

/**
*Create at 2018年1月2日 下午12:57:38
*
*@autuor EVIL
*
*@version 1.0
*
*ProjectName SSMConfig
*
*Description: 
*        
*/

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userdao;
	
	@Override
	public List<User> getUsers() {
		
		return userdao.getUserInfo();
	}

	@Override
	public List<Question> getQuestionInfo() {
		DynamicDataSourceHolder.setDataSource("datasource2");
		return userdao.getQuestionInfo();
	}
	
}
