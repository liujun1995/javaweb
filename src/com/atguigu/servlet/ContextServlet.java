package com.atguigu.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author LiuJun
 * @create 2021-05-20-14:57
 * @description
 */
public class ContextServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*ServletContext servletContext = getServletContext();*/
        ServletContext servletContext = getServletConfig().getServletContext();
        /*获取web.xml中配置的上下文参数context-param*/
        String username = servletContext.getInitParameter("username");
        System.out.println("context-param参数username的值是："+username);
        System.out.println("context-param参数password的值是："+servletContext.getInitParameter("password"));
        /*获取当前工程的路径*/
        System.out.println("当前工程路径："+servletContext.getContextPath());
        /*获取工程部署后在服务器硬盘上的绝对路径,/代表http://ip:port/工程名/*/
        System.out.println(servletContext.getRealPath("/"));
        /*获取工程部署后css目录服务器硬盘上的绝对路径*/
        System.out.println(servletContext.getRealPath("/css"));
        System.out.println(servletContext.getRealPath("/imgs/1.jpg"));
    }
}
