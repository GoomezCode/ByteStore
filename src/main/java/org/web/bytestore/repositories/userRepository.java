package org.web.bytestore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.web.bytestore.models.user;

@Repository
public interface userRepository extends JpaRepository<user, Long> {
}
