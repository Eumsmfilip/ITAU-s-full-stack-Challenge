package com.itau.research.service;

import com.itau.research.domain.User;
import com.itau.research.domain.UserRequestDTO;
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

    public User createUser(UserRequestDTO userRequestDTO){
        User newUser = new User(
                userRequestDTO.name(),
                userRequestDTO.lastName(),
                userRequestDTO.userParticipation()
        );
        return userRepository.save(newUser);
    }

}
