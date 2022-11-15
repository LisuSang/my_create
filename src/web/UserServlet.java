package web;

import com.myweb.pojo.User;
import com.myweb.service.UserService;
import com.myweb.service.impl.UserServiceImpl;
import com.myweb.utils.WebUtils;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.http.HttpClient;

public class UserServlet extends BaseServlet {
    private UserService userService = new UserServiceImpl();


    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, InvocationTargetException, IllegalAccessException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = userService.login(new User(null, username, null, password));
        if (user == null) {
            req.setAttribute("err", "用户名或密码错误");
            req.getRequestDispatcher("/static/login.jsp").forward(req, resp);
        } else {
            System.out.println("登录成功");
            req.getRequestDispatcher("/static/loginSuccess.jsp").forward(req, resp);

        }
    }

    protected void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        if (!userService.existUsername(name)) {
            req.setAttribute("ername", "用户名" + name + "已存在");
            req.getRequestDispatcher("/static/register.jsp").forward(req, resp);

        } else {
            User user = WebUtils.copyParamToBean(req.getParameterMap(), new User());
            userService.registerUser(user);
            req.getRequestDispatcher("/static/registSuccee.jsp").forward(req, resp);

        }

    }
}