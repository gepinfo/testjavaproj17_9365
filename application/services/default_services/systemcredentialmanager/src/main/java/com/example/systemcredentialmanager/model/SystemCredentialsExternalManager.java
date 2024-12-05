package com.example.systemcredentialmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
@Table(name = "systemCredentialsExternalManager")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SystemCredentialsExternalManager {

    @Id
    private String id;
    private String role;
    private String credentials;
    private String userId;
    private String createdDate;
    private String createdBy;
    private String lastModifiedBy;
    private String lastModifiedDate;

    public void setCredentials(List<Object> credentials) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            this.credentials = objectMapper.writeValueAsString(credentials);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting role list to JSON string", e);
        }
    }

    public List<String> getCredentials() {
        if (this.credentials == null || this.credentials.isEmpty()) {
            return new ArrayList<>();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(this.credentials, List.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting JSON string to role list", e);
        }
    }

}
