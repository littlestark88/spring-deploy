package com.example.deploy.spring_deploy.Repository;

import com.example.deploy.spring_deploy.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, String> {
}
