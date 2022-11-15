package com.myweb.servlet.test;

import com.myweb.pojo.Book;
import com.myweb.service.BookService;
import com.myweb.service.impl.BookServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookServiceImplTest {
      private BookService bookService=new BookServiceImpl();
    @Test
    public void addBook() {
        bookService.addBook(new Book(null,"提瓦特元素修炼手册","爷",""));
    }

    @Test
    public void deleteBookById() {
    }

    @Test
    public void updateBook() {
        bookService.updateBook(new Book(10003,"活着","刘德华",""));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookService.queryBookById(10002));
    }

    @Test
    public void queryBooks() {
    }
    @Test
    public void page(){
        System.out.println(bookService.page(1,4));
    }
}