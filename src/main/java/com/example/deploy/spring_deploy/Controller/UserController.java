package com.example.deploy.spring_deploy.Controller;

import com.example.deploy.spring_deploy.Model.User;
import com.example.deploy.spring_deploy.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @PostMapping
    public User save(@RequestBody User user) {
        userRepository.save(user);
        return user;
    }

    @GetMapping
    public List<User> list() {
        return userRepository.findAll();
    }
}
