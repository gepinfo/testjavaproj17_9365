package com.example.gepfilemanager.model;


import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name ="Attachments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileUrl;
    private String fileKey;
    private Object fileData;
    private String resource;
    private Date createdOn;
    private Date updatedOn;

}

