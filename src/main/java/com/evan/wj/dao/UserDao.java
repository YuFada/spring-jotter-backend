package com.evan.wj.dao;

import com.evan.wj.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author fada.yu
 * @date 2020/8/21 11:59
 * @Description：
 */
public interface UserDao extends JpaRepository<User,Integer> {
    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);
}
