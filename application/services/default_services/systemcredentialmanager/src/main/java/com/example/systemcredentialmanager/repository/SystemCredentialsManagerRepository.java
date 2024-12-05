package com.example.systemcredentialmanager.repository;


import com.example.systemcredentialmanager.model.SystemCredentialsExternalManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemCredentialsManagerRepository extends JpaRepository<SystemCredentialsExternalManager,String> {
    SystemCredentialsExternalManager findByUserId(String userId);
    void deleteByUserId(String userId);
}
