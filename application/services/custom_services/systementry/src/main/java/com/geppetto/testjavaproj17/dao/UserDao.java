package com.geppetto.testjavaproj17.dao;

import com.geppetto.testangproj1.model.Person;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

public interface UserDao {

    {GpUpdate=Optional<User>, GpFileUpload=User, GpGetAllValues=Page<User>, GpCreate=User, GpGetEntityById=Optional<User>, GpFileDownload=Optional<User>, GpDelete=void} {GpCreate=createUser, GpGetEntityById=getUserById, GpUpdate=updateUser, GpDelete=deleteUser, GpGetAllValues=getAllUser, GpFileUpload=fileUploadUser, GpFileDownload=fileDownloadUser}({GpCreate=User user, GpUpdate=String id, GpGetEntityById=String id, GpDelete=String id, GpGetAllValues=Pageable pageable, GpFileUpload=User fileEvent, GpFileDownload=String fileName});

}

