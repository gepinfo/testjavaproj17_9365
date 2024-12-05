package com.defaultServices.securitymanager.model;

import lombok.Data;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.UUID;
import java.sql.Timestamp;


@Entity
@Table(name = "roles")
@Data
public class Role {

    @Id
    private String id;
    private String role;
    @Column(updatable = false)
    private Date created_at;

    public Role(){

        this.id=UUID.randomUUID().toString();
        this.created_at = new Timestamp(System.currentTimeMillis());
    }
}

