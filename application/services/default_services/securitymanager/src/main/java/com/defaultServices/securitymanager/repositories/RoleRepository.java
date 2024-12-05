package com.defaultServices.securitymanager.repositories;

import com.defaultServices.securitymanager.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,String> {
    Role findByRole(String user);
    boolean existsByRole(String role);
}
