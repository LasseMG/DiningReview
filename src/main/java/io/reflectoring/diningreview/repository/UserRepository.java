package io.reflectoring.diningreview.repository;

import io.reflectoring.diningreview.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
    List<User> findAllByStateOrderByName(String name);
    boolean existsByUsername(String username);

}
