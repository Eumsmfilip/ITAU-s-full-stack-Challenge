package com.itau.research.service;

import com.itau.research.domain.User;
import org.springframework.stereotype.Service;
import com.itau.research.repository.UserRepository;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}