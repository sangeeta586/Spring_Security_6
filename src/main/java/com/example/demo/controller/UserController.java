package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;


    @PostMapping("/register")
    public ResponseEntity<User> save(@RequestBody User user) {
        User createdUser = userService.sighup(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return userService.verify(user);
    }


    @GetMapping
    public List<User> findAll() {
        return userService.getAllUsers();
    }


    @GetMapping("/{id}")
    public ResponseEntity<User> findOne(@PathVariable String id) {
        Optional<User> user = userService.getUserById(id);
        return user.map(u -> new ResponseEntity<>(u, HttpStatus.OK))
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        Optional<User> user = userService.getUserById(id);
        if (!user.isPresent()) {
            throw new ResourceNotFoundException("User not found with id: " + id);
        }
        userService.deleteUserById(id);
        return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<User> update(@PathVariable String id, @RequestBody User user) {
        User updatedUser = userService.updateUser(id, user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }
}
