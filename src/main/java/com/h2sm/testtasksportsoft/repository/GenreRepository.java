package com.h2sm.testtasksportsoft.repository;

import com.h2sm.testtasksportsoft.entity.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<GenreEntity, Long> {
}
