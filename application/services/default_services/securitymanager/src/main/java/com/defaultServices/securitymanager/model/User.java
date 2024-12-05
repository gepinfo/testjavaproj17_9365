package com.defaultServices.securitymanager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import jakarta.persistence.Table;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
@Table(name = "users")
@Data
@Builder
@AllArgsConstructor
public class User {

    @Id
    private String _id;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(unique = true)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;
    private String signintype;
    private String fbId;
    private String githubId;
    private String phonenumber;
    private String avatar;

    @Column(length = 4000)
    private String Idtoken;

    @Temporal(TemporalType.TIMESTAMP)
    private Date loggedinDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date loggedoutDate;

    @Column(columnDefinition = "CLOB")
    private String role;
    private String org;
    private String org_country;
    private String org_sub1;
    private String org_sub2;
    private String org_sub3;

    public User(){
        this._id = UUID.randomUUID().toString();
    }

     // Custom setter: Convert List<String> to JSON string
    public void setRole(List<String> roleList) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            this.role = objectMapper.writeValueAsString(roleList);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting role list to JSON string", e);
        }
    }

    // Custom getter: Convert JSON string to List<String>
    public List<String> getRole() {
        if (this.role == null || this.role.isEmpty()) {
            return new ArrayList<>();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(this.role, List.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting JSON string to role list", e);
        }
    }

}
