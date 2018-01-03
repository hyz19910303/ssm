package com.hyz.evil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hyz.evil.bean.Question;
import com.hyz.evil.bean.User;
import com.hyz.evil.service.UserService;

/**
*Create at 2018年1月2日 上午11:30:57
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
@Controller
public class PageController {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping(value= {"/user"})
	public String getUserInfo() {
		List<User> users = userservice.getUsers();
		System.out.println(users);
		return "user";
	}
	
	@RequestMapping(value= {"/question"})
	public String getQuestionInfo() {
		List<Question> questionInfo = userservice.getQuestionInfo();
		System.out.println(questionInfo);
		return "user";
	}
}
