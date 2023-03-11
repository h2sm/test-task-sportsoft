package com.h2sm.testtasksportsoft.repository;

import com.h2sm.testtasksportsoft.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
