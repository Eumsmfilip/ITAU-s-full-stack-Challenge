package controller;

import domain.User;
import domain.UserRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.UserRepository;
import service.UserService;

import java.util.List;

@RestController
@RequestMapping("/research")
public class UserController {

    UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
//    public ResponseEntity <List<User>> getUsers(){
//        List<User> users = userService.getAllUsers();
//        return ResponseEntity.ok(users);
//    }

    public ResponseEntity getAllUsers(){
        return ResponseEntity.ok("All right.");
    }

    @PostMapping
    public User createUser(@RequestBody UserRequestDTO userRequestDTO){
        User newUser = userService.createUser(userRequestDTO);
        return userRepository.save(newUser);
    }

}
