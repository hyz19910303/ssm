package com.hyz.evil.dao;

import java.util.List;

import com.hyz.evil.bean.Question;
import com.hyz.evil.bean.User;

/**
*Create at 2018年1月2日 下午1:00:57
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
public interface UserDao {
	
	List<User>  getUserInfo();
	
	
	List<Question>  getQuestionInfo();
}
