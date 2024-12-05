package com.default_service.gcam.repositories;

import com.default_service.gcam.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ResourceRepository extends JpaRepository<Resource, String> {

    @Query(value = "SELECT * FROM resources r, JSON_TABLE(r.roles, '$[*]' COLUMNS (role VARCHAR2(100) PATH '$')) jt WHERE jt.role = :role", nativeQuery = true)
    List<Resource> findByRoleContaining(@Param("role") String role);




}

