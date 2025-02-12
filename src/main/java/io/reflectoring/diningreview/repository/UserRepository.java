package io.reflectoring.diningreview.repository;

import io.reflectoring.diningreview.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
