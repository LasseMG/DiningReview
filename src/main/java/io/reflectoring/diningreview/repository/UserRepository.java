package io.reflectoring.diningreview.repository;

import io.reflectoring.diningreview.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
    List<User> findAllByStateOrderByName(String name);
    boolean existsByUsername(String username);

}
