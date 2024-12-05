package com.default_service.gcam.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "screens")
@Data
public class Screen{

    @Id
    private String _id;

    private String resources;
    private String role;
    @Column(updatable = false)
    private Date created_at;
    private String screenName;

    public Screen(){
        this._id = UUID.randomUUID().toString();
        this.created_at = new Timestamp(System.currentTimeMillis());
    }

}

