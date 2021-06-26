package com.atguigu.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author LiuJun
 * @create 2021-05-22-13:24
 * @description
 */
public class RequestDispatchFirst extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        System.out.println("doPost");
        System.out.println("请求的资源路径："+request.getRequestURI());
        System.out.println("请求的统一资源定位符："+request.getRequestURL());
        System.out.println("客户端IP地址："+request.getRemoteHost());
        System.out.println("请求头User-Agent:"+request.getHeader("user-agent"));
        System.out.println("请求方式："+request.getMethod());
        //获取表单的请求参数
        try {
            String username = request.getParameter("username");
            System.out.println("用户名："+username);
            String[] hobbies = request.getParameterValues("hobby");
            System.out.println("兴趣："+ Arrays.asList(hobbies));
            String password = request.getParameter("password");
            System.out.println("密码："+password);
            //放入共享数据
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            //设置转发路径
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/requestDispatch.html");
            //转发
            requestDispatcher.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
