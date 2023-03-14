package com.h2sm.testtasksportsoft.service.impl;

import com.h2sm.testtasksportsoft.dto.Book;
import com.h2sm.testtasksportsoft.entity.Books;
import com.h2sm.testtasksportsoft.mapper.impl.BookMapper;
import com.h2sm.testtasksportsoft.repository.AuthorRepository;
import com.h2sm.testtasksportsoft.repository.BookRepository;
import com.h2sm.testtasksportsoft.repository.GenreRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class BookService {
    private final GenreRepository genreRepository;
    private final AuthorRepository repository;
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public void create(Book book) {
        bookRepository.save(mapBook(book));
        //saveImage(book.getImage(), pathToPicture);
    }

    public Book read(Book book) {
        var bookEntity = bookRepository.findById(book.getBookId()).get();
        return mapBook(bookEntity);
    }

    public Book getBookById(Long id){
        return mapBook(bookRepository.findById((id)).get());
    }

    public void update(Book book) {
        create(book);
    }

    public void delete(Long id) {

        bookRepository.deleteById(id);
    }

    @SneakyThrows
    public List<Book> getBookByNameContaining(String bookName) {
        return bookRepository.getAllByBookNameContaining(bookName)
                .stream()
                .map(bookMapper::entityToDTO)
                .collect(Collectors.toList());
    }
    @SneakyThrows
    public List<Book> getBooksForThisUser(Long id) {
        return bookRepository.getAllByOwnerOfEntity_UserId(id)
                .stream()
                .map(bookMapper::entityToDTO)
                .collect(Collectors.toList());
    }

    public void changeNumberOfBooks(Long bookId, int newNum) {
        var book = bookRepository.findById(bookId).get();
        book.setAmountOfBooks(newNum);
        bookRepository.save(book);
    }

    @SneakyThrows
    public BufferedImage loadPicture(String pathToPicture) {
        return ImageIO.read(new File(pathToPicture));
    }

    @SneakyThrows
    public void saveImage(BufferedImage bufferedImage, String path){
        ImageIO.write(bufferedImage, ".png", new File(path));
    }

    private void deleteImage(String path){
        new File(path).delete();
    }

    private Book mapBook(Books books) {
        return bookMapper.entityToDTO(books);
    }

    private Books mapBook(Book book) {
        return bookMapper.DTOtoEntity(book);
    }

}
