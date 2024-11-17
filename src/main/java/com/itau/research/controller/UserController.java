package com.itau.research.controller;

import com.itau.research.domain.User;
import com.itau.research.domain.UserRequestDTO;
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

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PostMapping
    public ResponseEntity <User> createUser(@RequestBody UserRequestDTO userRequestDTO){
        User newUser = userService.createUser(userRequestDTO);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

}
