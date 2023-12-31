package com.example.demo.RepositoryPackage;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.EntityPackage.UserInfo;
@Component
public interface UserRepo extends JpaRepository<UserInfo, Integer> {

	UserInfo findByName(String username);

}
