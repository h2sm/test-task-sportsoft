package com.h2sm.testtasksportsoft.repository;

import com.h2sm.testtasksportsoft.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
