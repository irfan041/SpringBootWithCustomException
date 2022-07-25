package com.demo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.api.entity.User;
@Repository
public interface UserRepository  extends JpaRepository<User,Integer> {
    User findByUserId(int id);
}
