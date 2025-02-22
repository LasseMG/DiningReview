package io.reflectoring.diningreview.repository;

import io.reflectoring.diningreview.model.EndUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EndUserRepository extends CrudRepository<EndUser, Long> {
    Optional<EndUser> findByUsername(String username);
    boolean existsByUsername(String username);

}
