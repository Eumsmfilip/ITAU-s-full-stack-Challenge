package com.itau.research.controller;

import com.itau.research.domain.User;
import com.itau.research.domain.UserRequestDTO;
import com.itau.research.domain.UserResponseDTO;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.itau.research.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/research")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping
//    public ResponseEntity<List<User>> getUsers() {
//        List<User> users = userService.getAllUsers();
//        return ResponseEntity.ok(users);
//    }

    @GetMapping
    public ResponseEntity<User> getUser(@RequestBody UserResponseDTO data){
        User user = userService.getUserById(data);
        return ResponseEntity.ok(user);
    }


    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserRequestDTO userRequestDTO) {
        User newUser = userService.createUser(userRequestDTO);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody UserResponseDTO userResponseDTO) {
        User updatedUser = userService.updateUser(userResponseDTO);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping
    @Transactional
    public ResponseEntity deleteUser(@RequestBody UserResponseDTO userResponseDTO) {
        User deletedUser = userService.deleteUser(userResponseDTO);
        return ResponseEntity.noContent().build();
    }

}
