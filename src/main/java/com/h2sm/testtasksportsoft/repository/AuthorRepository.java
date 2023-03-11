package com.h2sm.testtasksportsoft.repository;

import com.h2sm.testtasksportsoft.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
}
