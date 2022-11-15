package com.myweb.servlet.test;

import com.myweb.dao.BookDao;
import com.myweb.dao.impl.BookDaoImpl;
import com.myweb.pojo.Book;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.List;

import static org.junit.Assert.*;

public class BookDaoTest {
    private BookDao bookDao=new BookDaoImpl();

    @Test
    public void addBook() {
        bookDao.addBook(new Book(null,"爱莉希雅的奇幻冒险","李易峰",null));
    }

    @Test
    public void deleteBookById() {
        bookDao.deleteBookById(10003);
    }

    @Test
    public void updateBook() {
        bookDao.updateBook(new Book(10002,"java从入门到放弃","刘强",""));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookDao.queryBookById(10002));
    }

    @Test
    public void queryBooks() {
        for (Book book: bookDao.queryBooks()
             ) {
            System.out.println(book);
        }
    }
    @Test
    public void queryForPageTotalCount() {
        System.out.println(bookDao.queryForPageTotalCount());
    }

    @Test
    public void queryForPageItems() {
        for (Book book : bookDao.queryForPageItems(2, 4)) {
            System.out.println(book);
        }


    }
    @Test
    public void queryForPageTotalCountByKeyword() {
        System.out.println(bookDao.queryForPageTotalCountByKeyword("爱"));
    }
    @Test
    public void queryForPageItemsBykeyword() {
        for (Book book : bookDao.queryForPageItemsByKeyword(0,3,"李")) {
            System.out.println(book);
        }

    }
}
