package com.h2sm.testtasksportsoft.repository;

import com.h2sm.testtasksportsoft.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Users getUserEntityByLoginEquals(String login);
}
