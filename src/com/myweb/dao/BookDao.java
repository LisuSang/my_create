package com.myweb.dao;

import com.myweb.pojo.Book;

import java.util.List;


public interface BookDao {
    public int addBook(Book book);

    public int deleteBookById(Integer id);

    public int updateBook(Book book);

    public Book queryBookById(Integer id);

    public List<Book> queryBooks();

    Integer queryForPageTotalCount();

    List<Book> queryForPageItems(int begin, int pageSize);

    Integer queryForPageTotalCountByKeyword(String keyword);

    List<Book> queryForPageItemsByKeyword(int begin, int pageSize, String keyword);
}
