package com.example.authproxy.repository;

import com.example.authproxy.model.SignIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<SignIn,String> {
}
