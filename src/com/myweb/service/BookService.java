package com.myweb.service;

import com.myweb.pojo.Book;
import com.myweb.pojo.Page;

import java.util.List;

public interface BookService {
    public void addBook(Book book);
    public void deleteBookById(Integer id);
    public void updateBook(Book book);
    public  Book queryBookById(Integer id);
    public List<Book> queryBooks();

    Page<Book> page(int pageNo, int pageSize);
    Page<Book> pageByKeword(int pageNo, int pageSize ,String keyword);
}
