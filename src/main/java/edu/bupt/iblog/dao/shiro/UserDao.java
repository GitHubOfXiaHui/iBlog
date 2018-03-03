package edu.bupt.iblog.dao.shiro;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.bupt.iblog.entity.shiro.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
