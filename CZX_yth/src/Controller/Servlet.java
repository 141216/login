package Controller;

import Entity.User;
import Service.TestService;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Servlet extends javax.servlet.http.HttpServlet{
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String flag = request.getParameter("flag");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        switch (flag) {
            case "login":
                try {
                    Login(request, response);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
    }

    public void Login(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        User u = new User();
        u.setName(name);
        u.setPassword(password);
        TestService t = new TestService();
        boolean isSucceed = t.login(u);
        if (isSucceed == true) {
            System.out.println("登录成功");
            //request.setAttribute("test","czx");
            request.setAttribute("name", name);
            //request.getRequestDispatcher("Admin.jsp").forward(request, response);
            response.getWriter().print("<script language='javascript'>alert('登陆成功！');location.replace('http://localhost:8080/Admin.jsp');</script>");
            } else {
            System.out.println("登录失败");
            // request.getRequestDispatcher("login.jsp").forward(request, response);
            response.getWriter().print("<script language='javascript'>alert('登陆失败！用户名或密码错误！');location.replace('http://localhost:8080/login.jsp');</script>");
        }

    }
}

