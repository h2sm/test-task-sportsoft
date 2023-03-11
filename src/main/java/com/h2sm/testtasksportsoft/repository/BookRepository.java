package com.h2sm.testtasksportsoft.repository;

import com.h2sm.testtasksportsoft.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
    List<BookEntity> getAllByOwnerOfEntity_UserId(Long id);
    List<BookEntity> getAllByBookNameContaining(String bookname);
}
