package service;

import domain.User;
import domain.UserRequestDTO;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    UserRepository userRepository;
    UserRequestDTO userRequestDTO;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserService(UserRequestDTO userRequestDTO) {
        this.userRequestDTO = userRequestDTO;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(UserRequestDTO userRequestDTO) {
        User newUser = new User(userRequestDTO);
        return userRepository.save(newUser);
    }

}
