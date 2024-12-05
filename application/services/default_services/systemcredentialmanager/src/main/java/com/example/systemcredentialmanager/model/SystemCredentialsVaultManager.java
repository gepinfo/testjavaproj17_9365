package com.example.systemcredentialmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SystemCredentialsVaultManager {


    private String role;
    private List<Object> credentials;
    private String userId;
    private String createdDate;
    private String createdBy;
    private String lastModifiedBy;
    private String lastModifiedDate;

}
