package com.itau.research.service;

import com.itau.research.domain.User;
import com.itau.research.domain.UserRequestDTO;
import com.itau.research.domain.UserResponseDTO;
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

    public User updateUser(UserResponseDTO userResponseDTO){
        User userUpdated = userRepository.getReferenceById(userResponseDTO.id());
        userUpdated.setName(userResponseDTO.name());
        userUpdated.setLastName(userResponseDTO.lastName());
        userUpdated.setUserParticipation(userResponseDTO.userParticipation());
        return userRepository.save(userUpdated);
    }


}
