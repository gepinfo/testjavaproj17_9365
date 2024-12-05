package com.example.gepfilemanager.repository;

import com.example.gepfilemanager.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachmentToDBRepository extends JpaRepository<Attachment,Long> {
    void deleteByFileKey(String fileKey);
}
