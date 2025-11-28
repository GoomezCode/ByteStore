package org.web.bytestore.dao;

import org.springframework.data.repository.CrudRepository;
import org.web.bytestore.models.user;

public interface userDao extends CrudRepository<user,Long> {
}
