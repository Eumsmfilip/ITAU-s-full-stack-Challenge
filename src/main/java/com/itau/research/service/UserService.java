package com.itau.research.service;

import com.itau.research.domain.User;
import com.itau.research.domain.UserRequestDTO;
import com.itau.research.domain.UserResponseDTO;
import org.springframework.stereotype.Service;
import com.itau.research.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(UserRequestDTO userRequestDTO) {
        User newUser = new User(
                userRequestDTO.name(),
                userRequestDTO.lastName(),
                userRequestDTO.userParticipation(),
                userRequestDTO.active()
        );
        return userRepository.save(newUser);
    }

    public User updateUser(UserResponseDTO userResponseDTO) {
        User userUpdated = userRepository.getReferenceById(userResponseDTO.id());
        userUpdated.setName(userResponseDTO.name());
        userUpdated.setLastName(userResponseDTO.lastName());
        userUpdated.setUserParticipation(userResponseDTO.userParticipation());
        return userRepository.save(userUpdated);
    }

    public User deleteUser(UserResponseDTO userResponseDTO) {
        Optional<User> userOptional = userRepository.findById(userResponseDTO.id());
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setActive(false);
        }
        return null;

    }


}
