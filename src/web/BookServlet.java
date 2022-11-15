package web;

import com.myweb.dao.impl.BookDaoImpl;
import com.myweb.pojo.Book;
import com.myweb.pojo.Page;
import com.myweb.service.BookService;
import com.myweb.service.impl.BookServiceImpl;
import com.myweb.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BookServlet extends BaseServlet{
      BookService bookService=new BookServiceImpl();
    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int pageNo=WebUtils.parseInt(req.getParameter("pageNo"),0);
       pageNo+=1;
        Book book= WebUtils.copyParamToBean(req.getParameterMap(),new Book());
        bookService.addBook(book);
        System.out.println("添加成功");
        resp.sendRedirect(req.getContextPath()+"/manager/bookServlet?action=page&pageNo="+pageNo);
    }
    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      int id=WebUtils.parseInt(req.getParameter("id"),0);
        bookService.deleteBookById(id);
        System.out.println("删除成功");
        resp.sendRedirect(req.getContextPath()+"/manager/bookServlet?action=page&pageNo="+req.getParameter("pageNo"));
    }
    protected void query(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      List<Book> books=bookService.queryBooks();
     req.setAttribute("books",books);
        System.out.println("bookservlet访问成功");
req.getRequestDispatcher("/static/manager/book_manager.jsp").forward(req,resp);
    }
    protected void getBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入getBook");
        int id=WebUtils.parseInt(req.getParameter("id"),0);
        Book book=bookService.queryBookById(id);
        req.setAttribute("book",book);
        req.getRequestDispatcher("/static/manager/book_edit.jsp").forward(req,resp);

    }
    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book book =WebUtils.copyParamToBean(req.getParameterMap(),new Book());
        bookService.updateBook(book);
        resp.sendRedirect(req.getContextPath()+"/manager/bookServlet?action=page&pageNo="+req.getParameter("pageNo"));

    }
    protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
         int pageNo=WebUtils.parseInt(req.getParameter("pageNo"),1);
         int pageSize=WebUtils.parseInt(req.getParameter("pageSize"), Page.PAGE_SIZE);

         Page<Book> page=bookService.page(pageNo,pageSize);
         page.setUrl("manager/bookServlet?action=page");
         req.setAttribute("page",page);
         req.getRequestDispatcher("/static/manager/book_manager.jsp").forward(req,resp);
    }
}
