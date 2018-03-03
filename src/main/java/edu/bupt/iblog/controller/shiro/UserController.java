package edu.bupt.iblog.controller.shiro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.bupt.iblog.entity.shiro.User;
import edu.bupt.iblog.service.shiro.UserService;

@RestController
@RequestMapping("/shiro/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public User createUser(User user) {
		return userService.createUser(user);
	}
}
