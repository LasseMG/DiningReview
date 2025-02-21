package io.reflectoring.diningreview.service;

import io.reflectoring.diningreview.dto.UserAllergyDTO;
import io.reflectoring.diningreview.dto.UserDTO;
import io.reflectoring.diningreview.exceptions.EntityNotFoundException;
import io.reflectoring.diningreview.model.EndUser;
import io.reflectoring.diningreview.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public EndUser createUser(EndUser user) {
        return userRepository.save(user);
    }

    public EndUser updateUser(EndUser user) {
        return userRepository.save(user);
    }

    public UserDTO getUserDTOByName(String name) {
        Optional<EndUser> user = userRepository.findByUsername(name);
        return user.map(UserDTO::new).orElseThrow(() -> new EntityNotFoundException(name));
    }

    public boolean verifyUserByName(String name) {
        return userRepository.findByUsername(name).isPresent();
    }

    public UserAllergyDTO getUserAllergyByName(String name) {
        Optional<EndUser> user = userRepository.findByUsername(name);
        if (user.isPresent()) {
            return new UserAllergyDTO(user.get());
        } else {
            throw new EntityNotFoundException(name);
        }
    }

    public EndUser getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found"));
    }

    public void deleteUserById(Long id) {
        Optional<EndUser> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new EntityNotFoundException("User not found");
        }
        userRepository.deleteById(id);
    }
}
