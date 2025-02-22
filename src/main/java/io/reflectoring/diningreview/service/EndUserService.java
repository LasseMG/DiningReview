package io.reflectoring.diningreview.service;

import io.reflectoring.diningreview.dto.EndUserAllergyDTO;
import io.reflectoring.diningreview.dto.EndUserDTO;
import io.reflectoring.diningreview.exceptions.EntityNotFoundException;
import io.reflectoring.diningreview.model.EndUser;
import io.reflectoring.diningreview.repository.EndUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EndUserService {

    private final EndUserRepository endUserRepository;

    @Autowired
    public EndUserService(EndUserRepository endUserRepository) {
        this.endUserRepository = endUserRepository;
    }

    public EndUser createUser(EndUser user) {
        return endUserRepository.save(user);
    }

    public EndUser updateUser(EndUser user) {
        Optional<EndUser> endUserOptional = endUserRepository.findById(user.getId());
        if (endUserOptional.isPresent()) {
            EndUser endUser = endUserOptional.get();
            endUser.setCity(user.getCity());
            endUser.setState(user.getState());
            endUser.setZipcode(user.getZipcode());
            endUser.setId(user.getId());
            endUser.setUsername(user.getUsername());
            endUser.setDairyAllergic(endUser.isDairyAllergic());
            endUser.setEggAllergic(endUser.isEggAllergic());
            endUser.setPeanutAllergic(endUser.isPeanutAllergic());
            return endUserRepository.save(endUser);
        } else {
            return null;
        }
    }

    public EndUserDTO getUserDTOByName(String name) {
        Optional<EndUser> user = endUserRepository.findByUsername(name);
        return user.map(EndUserDTO::new).orElseThrow(() -> new EntityNotFoundException(name));
    }

    public boolean verifyUserByName(String name) {
        return endUserRepository.findByUsername(name).isPresent();
    }

    public EndUserAllergyDTO getUserAllergyByName(String name) {
        Optional<EndUser> user = endUserRepository.findByUsername(name);
        if (user.isPresent()) {
            return new EndUserAllergyDTO(user.get());
        } else {
            throw new EntityNotFoundException(name);
        }
    }

    public EndUser getUserById(Long id) {
        return endUserRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found"));
    }

    public void deleteUserById(Long id) {
        Optional<EndUser> user = endUserRepository.findById(id);
        if (user.isEmpty()) {
            throw new EntityNotFoundException("User not found");
        }
        endUserRepository.deleteById(id);
    }
}
