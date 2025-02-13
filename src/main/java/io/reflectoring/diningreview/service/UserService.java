package io.reflectoring.diningreview.service;

import io.reflectoring.diningreview.model.User;
import io.reflectoring.diningreview.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public User getUserByName(String name) {
        return userRepository.findByUsername(name);
    }

    public boolean verifyUserByName(String name) {
        return userRepository.findByUsername(name) != null;
    }
}
