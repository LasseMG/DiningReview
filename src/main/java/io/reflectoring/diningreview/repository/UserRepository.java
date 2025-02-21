package io.reflectoring.diningreview.repository;

import io.reflectoring.diningreview.model.EndUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<EndUser, Long> {
    Optional<EndUser> findByUsername(String username);
    List<EndUser> findAllByStateOrderByName(String name);
    boolean existsByUsername(String username);

}
