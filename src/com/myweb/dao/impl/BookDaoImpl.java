package com.myweb.dao.impl;

import com.myweb.dao.BookDao;
import com.myweb.pojo.Book;

import java.util.List;

public class BookDaoImpl extends BaseDao implements BookDao{
    @Override
    public int addBook(Book book) {
        String sql = "insert into re_books (name,author,imgpath) values(?,?,?)";
        return update(sql,book.getName(),book.getAuthor(),book.getImgPath());

    }

    @Override
    public int deleteBookById(Integer id) {
        String sql="delete from re_books where id=?";
        return update(sql,id);
    }

    @Override
    public int updateBook(Book book) {
        String sql="update re_books set name=?,author=?,imgpath=? where id=?";
        return update(sql,book.getName(),book.getAuthor(),book.getImgPath(),book.getId());
    }

    @Override
    public Book queryBookById(Integer id) {
        String sql="select id,name,author,imgpath from re_books where id=?";
        return queryForOne(Book.class,sql,id);
    }

    @Override
    public List<Book> queryBooks() {
        String sql="select id,name,author,imgpath from re_books";
        return queryForList(Book.class,sql);
    }

    @Override
    public Integer queryForPageTotalCount() {
       String sql = "select count(*) from re_books";
       Number count = (Number) queryForsingleValue(sql);
             return count.intValue();
     }

    @Override
    public List<Book> queryForPageItems(int begin, int pageSize) {

        String sql="select id,name,author,imgpath from re_books limit ?,?";
        return queryForList(Book.class,sql,begin,pageSize);
    }

    @Override
    public Integer queryForPageTotalCountByKeyword(String keyword) {
        String sql = "select count(*) from re_books where name like ?or  author like ?";
        Number count = (Number) queryForsingleValue(sql,keyword+"%",keyword+"%");
        return count.intValue();
    }

    @Override
    public List<Book> queryForPageItemsByKeyword(int begin, int pageSize, String keyword) {
        String sql="select id,name,author,imgpath from re_books where name like ? or author like ? limit ?,?";
        return queryForList(Book.class,sql,keyword+"%",keyword+"%",begin,pageSize);
    }

}
