package com.example.authproxy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@Table(name = "signins")
public class SignIn {

        @Id
        private String id;

        private String username;
        private String firstname;
        private String lastname;
        private String email;
        private String password;
        private String role;
        private Boolean expired;
        private String idToken;
        private Date loggedInDate;
        private Date loggedOutDate;

        public SignIn() {
            this.id = UUID.randomUUID().toString();
        }

}
