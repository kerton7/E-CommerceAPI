package com.alituran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alituran.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
