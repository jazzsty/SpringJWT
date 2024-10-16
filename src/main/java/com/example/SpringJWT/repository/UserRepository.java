package com.example.SpringJWT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringJWT.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

	Boolean existsByUsername(String useranme);
}
