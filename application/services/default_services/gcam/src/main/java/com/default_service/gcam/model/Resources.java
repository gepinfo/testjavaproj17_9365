package com.default_service.gcam.model;

import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
public class Resources {


    @Id
    private String _id;
    private String resource_name;
    private String resource_type;

    private List<String> roles;
    private List<Object> components;

    private Date created_at;
    
    public Resources() {
        this._id = UUID.randomUUID().toString();
        this.created_at = new Timestamp(System.currentTimeMillis());
    }

}