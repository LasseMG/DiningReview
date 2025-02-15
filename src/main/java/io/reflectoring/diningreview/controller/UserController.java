package io.reflectoring.diningreview.controller;

import io.reflectoring.diningreview.dto.UserAllergyDTO;
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
    public UserDTO getUserDTOByName(@RequestParam String name) {
        return userService.getUserDTOByName(name);
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

    @GetMapping
    public UserAllergyDTO getUserAllergy(@RequestParam String name) {
        return userService.getUserAllergyByName(name);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    //TODO ResponseEntity for alle metoder
}
