package io.reflectoring.diningreview.controller;

import io.reflectoring.diningreview.dto.UserAllergyDTO;
import io.reflectoring.diningreview.dto.UserDTO;
import io.reflectoring.diningreview.exceptions.EntityNotFoundException;
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
    public ResponseEntity<UserDTO> getUserDTOByName(@RequestParam String name) {
        UserDTO userDTO = userService.getUserDTOByName(name);
        return ResponseEntity.ok(userDTO);
    }

    @GetMapping("/validate")
    public ResponseEntity<String> verifyUserByName(@RequestParam String name) {
        boolean exists = userService.verifyUserByName(name);
        if (exists) {
            return ResponseEntity.ok("User exists");
        } else {
            throw new EntityNotFoundException("User not found:  " + name);
        }
    }

    @GetMapping
    public ResponseEntity<UserAllergyDTO> getUserAllergy(@RequestParam String name) {
        UserAllergyDTO userAllergiesDTO = userService.getUserAllergyByName(name);
        return ResponseEntity.ok(userAllergiesDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserById(@RequestParam Long id) {
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }
}
