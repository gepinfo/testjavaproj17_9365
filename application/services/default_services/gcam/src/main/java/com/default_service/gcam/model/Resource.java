package com.default_service.gcam.model;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "resources")
@Data
public class Resource {

    @Id
    private String _id;

    private String resource_name;
    private String resource_type;

    @Lob
    @Column(name = "roles", columnDefinition = "CLOB")
    private String roles; 

    @Lob
    @Column(columnDefinition = "CLOB")
    private String components; 

    @Column(updatable = false)
    private Date created_at;

    @Transient
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public Resource() {
        this._id = UUID.randomUUID().toString();
        this.created_at = new Timestamp(System.currentTimeMillis());
    }

    public List<String> getRolesAsList() {
        try {
            return objectMapper.readValue(roles, new TypeReference<List<String>>() {});
        } catch (Exception e) {
            return null;
        }
    }

    public void setRolesFromList(List<String> rolesList) {
        try {
            this.roles = objectMapper.writeValueAsString(rolesList);
        } catch (Exception e) {
            this.roles = null;
        }
    }

    public List<Object> getComponentsAsList() {
        try {
            return objectMapper.readValue(components, new TypeReference<List<Object>>() {});
        } catch (Exception e) {
            return null;
        }
    }

    public void setComponentsFromList(List<Object> componentsList) {
        try {
            this.components = objectMapper.writeValueAsString(componentsList);
        } catch (Exception e) {
            this.components = null;
        }
    }
}
