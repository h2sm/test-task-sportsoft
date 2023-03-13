package com.h2sm.testtasksportsoft.repository;

import com.h2sm.testtasksportsoft.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Books, Long> {
    List<Books> getAllByOwnerOfEntity_UserId(Long id);
    List<Books> getAllByBookNameContaining(String bookname);
}
