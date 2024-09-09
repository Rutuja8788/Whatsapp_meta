package com.example.simple_controller.service;

import com.example.simple_controller.entity.User;
import com.example.simple_controller.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String registerUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            return "User already exists.";
        }
        userRepository.save(user);
        return "Registration successful.";
    }

    public Optional<User> loginUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return Optional.of(user); // Return the User object if login is successful
        } else {
            return Optional.empty(); // Return an empty Optional if login fails
        }
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
