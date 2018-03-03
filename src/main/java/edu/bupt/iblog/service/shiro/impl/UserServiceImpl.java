package edu.bupt.iblog.service.shiro.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.bupt.iblog.dao.shiro.UserDao;
import edu.bupt.iblog.entity.shiro.User;
import edu.bupt.iblog.service.shiro.UserService;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public User createUser(User user) {
		return userDao.save(user);
	}

}
