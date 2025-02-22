package io.reflectoring.diningreview.controller;

import io.reflectoring.diningreview.dto.EndUserAllergyDTO;
import io.reflectoring.diningreview.exceptions.EntityNotFoundException;
import io.reflectoring.diningreview.model.EndUser;
import io.reflectoring.diningreview.service.EndUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class EndUserController {

    private final EndUserService endUserService;

    @Autowired
    public EndUserController(EndUserService endUserService) {
        this.endUserService = endUserService;
    }

    @PostMapping
    public EndUser createUser(@RequestBody EndUser endUser) {
        return endUserService.createUser(endUser);
    }

    @PutMapping
    public EndUser updateUser(@RequestBody EndUser endUser) {
        EndUser endUserToUpdate = endUserService.updateUser(endUser);
        if (endUserToUpdate == null) {
            throw new EntityNotFoundException("End user not found");
        } else {
            return endUserToUpdate;
        }
    }


    @GetMapping("/validate")
    public ResponseEntity<String> verifyUserByName(@RequestParam String name) {
        boolean exists = endUserService.verifyUserByName(name);
        if (exists) {
            return ResponseEntity.ok("User exists");
        } else {
            throw new EntityNotFoundException("User not found:  " + name);
        }
    }

    @GetMapping("/dto")
    public ResponseEntity<EndUserAllergyDTO> getUserAllergy(@RequestParam String name) {
        EndUserAllergyDTO userAllergiesDTO = endUserService.getUserAllergyByName(name);
        return ResponseEntity.ok(userAllergiesDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EndUser> findUserById(@PathVariable Long id) {
        EndUser user = endUserService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserById(@RequestParam Long id) {
        endUserService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }
}
