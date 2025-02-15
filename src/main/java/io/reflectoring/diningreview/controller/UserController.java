package io.reflectoring.diningreview.controller;

import io.reflectoring.diningreview.dto.UserDTO;
import io.reflectoring.diningreview.model.User;
import io.reflectoring.diningreview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @GetMapping
    public UserDTO getUserByName(@RequestParam String name) {
        return userService.getUserByName(name);
    }

    @GetMapping("/validate")
    public ResponseEntity<String> verifyUserByName(@RequestParam String name) {
        boolean exists = userService.verifyUserByName(name);
        if (exists) {
            return new ResponseEntity<>("User already exists", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }
    }
}
