package com.hyz.evil.service;

import java.util.List;

import com.hyz.evil.bean.Question;
import com.hyz.evil.bean.User;

/**
*Create at 2018年1月2日 下午12:58:02
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
public interface UserService {
	
	List<User> getUsers();
	
	List<Question>  getQuestionInfo();
}
