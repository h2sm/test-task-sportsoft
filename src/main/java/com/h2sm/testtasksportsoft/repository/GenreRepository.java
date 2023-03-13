package com.h2sm.testtasksportsoft.repository;

import com.h2sm.testtasksportsoft.entity.Genres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genres, Long> {
}
