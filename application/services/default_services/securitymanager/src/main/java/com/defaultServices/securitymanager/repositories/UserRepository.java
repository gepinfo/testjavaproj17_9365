package com.defaultServices.securitymanager.repositories;

import com.defaultServices.securitymanager.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User findByEmailAndPassword(String email, String password);

    boolean existsByEmail(String email);

    User findByEmail(String email);

    Optional<Object> findByUsername(String username);
}