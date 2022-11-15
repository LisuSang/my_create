package web;

import com.myweb.pojo.Book;
import com.myweb.pojo.Page;
import com.myweb.service.BookService;
import com.myweb.service.impl.BookServiceImpl;
import com.myweb.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ClientBookServlet extends BaseServlet{
    private BookService bookService=new BookServiceImpl();
    protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("前台转发Clientbookserlvet");
        int pageNo= WebUtils.parseInt(req.getParameter("pageNo"),1);
        int pageSize=WebUtils.parseInt(req.getParameter("pageSize"), Page.PAGE_SIZE);

        Page<Book> page=bookService.page(pageNo,pageSize);
        page.setUrl("client/clientBookServlet?action=page");
        req.setAttribute("page",page);
        req.getRequestDispatcher("/static/client/clientdispaly.jsp").forward(req,resp);
    }
    protected void pageByKeyword(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        int pageNo= WebUtils.parseInt(req.getParameter("pageNo"),1);
        int pageSize=WebUtils.parseInt(req.getParameter("pageSize"), Page.PAGE_SIZE);
        String keyword=req.getParameter("keyword");
        if(keyword == null){
            keyword = "%";
        }
        StringBuilder url= new StringBuilder("client/clientBookServlet?action=pageByKeyword");
        if(keyword != null){
            url.append("&keyword=").append(req.getParameter("keyword"));
        }
        Page<Book> page=bookService.pageByKeword(pageNo,pageSize,keyword);
        page.setUrl(url.toString());
        req.setAttribute("page",page);
        req.getRequestDispatcher("/static/client/clientdispaly.jsp").forward(req,resp);
    }
}

