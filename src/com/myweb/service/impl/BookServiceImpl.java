package com.myweb.service.impl;

import com.myweb.dao.BookDao;
import com.myweb.dao.impl.BookDaoImpl;
import com.myweb.pojo.Book;
import com.myweb.pojo.Page;
import com.myweb.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {
    private BookDao bookDao=new BookDaoImpl();
    @Override
    public void addBook(Book book) {
       bookDao.addBook(book);
    }

    @Override
    public void deleteBookById(Integer id) {
        bookDao.deleteBookById(id);
    }

    @Override
    public void updateBook(Book book) {
         bookDao.updateBook(book);
    }

    @Override
    public Book queryBookById(Integer id) {
        return bookDao.queryBookById(id);
    }

    @Override
    public List<Book> queryBooks() {
        return bookDao.queryBooks();
    }

    @Override
    public Page<Book> page(int pageNo, int pageSize) {
        Page<Book> page =new Page<Book>();
        page.setPageSize(pageSize);
        Integer pageTotalCount = bookDao.queryForPageTotalCount();

        page.setPageTotalCount(pageTotalCount);
        Integer pageTotal =pageTotalCount / pageSize;
        if(pageTotalCount % pageSize > 0) {
            pageTotal+=1;
        }
        page.setPageTotal(pageTotal);
        page.setPageNo(pageNo);
        int begin = (page.getPageNo()-1)*pageSize;
        //当前页数据
        List<Book> items = bookDao.queryForPageItems(begin,pageSize);
        //设置当前页数据
        page.setItems(items);
        return page;
    }

    @Override
    public Page<Book> pageByKeword(int pageNo, int pageSize, String keyword) {
        Page<Book> page =new Page<Book>();
        page.setPageSize(pageSize);
        Integer pageTotalCount = bookDao.queryForPageTotalCountByKeyword(keyword);

        page.setPageTotalCount(pageTotalCount);
        Integer pageTotal =pageTotalCount / pageSize;
        if(pageTotalCount % pageSize > 0) {
            pageTotal+=1;
        }
        page.setPageTotal(pageTotal);
        page.setPageNo(pageNo);
        int begin = (page.getPageNo()-1)*pageSize;
        //当前页数据
        List<Book> items = bookDao.queryForPageItemsByKeyword(begin,pageSize,keyword);
        //设置当前页数据
        page.setItems(items);
        return page;
    }
}
