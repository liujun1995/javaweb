package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author LiuJun
 * @create 2021-05-22-20:05
 * @description
 */
public class Redirect extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Redirect");
       /* response.setStatus(302);response.setHeader("location", "http://127.0.0.1:8080/javaweb/index.html");*/
        response.sendRedirect("http://127.0.0.1:8080/javaweb/index.html");
    }
}
