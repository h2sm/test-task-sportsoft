package com.h2sm.testtasksportsoft.repository;

import com.h2sm.testtasksportsoft.entity.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Authors, Long> {
}
