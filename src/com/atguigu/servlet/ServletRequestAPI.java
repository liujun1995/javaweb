package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author LiuJun
 * @create 2021-05-22-9:07
 * @description
 */
public class ServletRequestAPI extends HttpServlet {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //当是post请求时，需设置请求体的编码格式为utf-8，不然获取请求体中参数的值时，中文会出现乱码

        System.out.println("doGet");
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
