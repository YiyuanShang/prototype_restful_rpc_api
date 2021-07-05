package com.athensoft.prototype.rpc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.athensoft.prototype.rpc.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
