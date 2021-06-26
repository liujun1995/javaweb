package com.atguigu.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author LiuJun
 * @create 2021-05-19-17:13
 * @description
 */
public class HelloServlet implements Servlet {

    public HelloServlet() {
        System.out.println("Do constructor!");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        /*配置文件中的servlet-name*/
        System.out.println("HelloServlet的别名是："+servletConfig.getServletName());
        /*配置文件中的init-param*/
        System.out.println("初始化参数的值是："+servletConfig.getInitParameter("username"));
        System.out.println("初始化参数的值是："+servletConfig.getInitParameter("url"));
        /*获取当前的web应用*/
        System.out.println("初始化参数的值是："+servletConfig.getServletContext());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * service方法是专门处理请求和响应的
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet!");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        /*获取请求的方式*/
        String method = httpServletRequest.getMethod();
        if ("GET".equals(method)){
            doGet();
        }else if("POST".equals(method)){
            doPost();
        }
    }

    public void doGet(){
        System.out.println("Get请求！");
    }

    public void doPost(){
        System.out.println("Post请求！");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Do destroy!");
    }
}
