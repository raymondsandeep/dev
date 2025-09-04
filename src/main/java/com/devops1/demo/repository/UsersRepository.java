package com.devops1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devops1.demo.domain.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {
Users findByUsernameAndPassword(String userid, String pass);
}
