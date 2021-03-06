package com.wyy.dao;

import com.wyy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
     User findByNameAndPassword(String name, String password);

}
