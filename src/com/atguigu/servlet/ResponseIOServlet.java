package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author LiuJun
 * @create 2021-05-22-16:57
 * @description
 */
public class ResponseIOServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*设置服务器使用utf-8
        response.setCharacterEncoding("utf-8");
        System.out.println(response.getCharacterEncoding());
        通过响应头，设置浏览器也使用utf-8编码格式
        response.setHeader("content-type", "text/html; charset=utf-8");*/
        //另一种简单的方式是response.setContentType(),但需注意的是需在response.getWriter()之前进行调用
        response.setContentType("text/html; charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.print("<div>字符集!!!</div>");
    }
}
