package com.atguigu.servlet;

import org.apache.commons.io.IOUtils;
import sun.misc.BASE64Encoder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @author LiuJun
 * @create 2021-06-14-10:32
 * @description
 */
public class Download extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //要下载的文件名
        String downloadFileName = "gra副本.png";
        //1通过request对象，获取servletContext对象
        ServletContext servletContext = request.getServletContext();
        //2.通过servletContext对象得到读取文件的传输数据类型
        String mimeType = servletContext.getMimeType("/file/downloadFile/" + downloadFileName);
        /*System.out.println(mimeType);image/png*/



        //3.在回传前，通过response响应头告诉客户端返回的数据类型
        response.setContentType(mimeType);


        //4.在回传前，通过response告诉客户端收到的数据用于下载
        if (request.getHeader("User-Agent").contains("Firefox")) {
            response.setHeader("Content-Disposition",
                    "attachment;filename=" + "=?UTF-8?B?" +
                            new BASE64Encoder().encode(downloadFileName.getBytes(StandardCharsets.UTF_8)) + "?=");
        } else {
            response.setHeader("Content-Disposition",
                    "attachment;filename=" + URLEncoder.encode("职业照.png", "utf-8"));
        }


        //5.通过servletContext.getResourceAsStream读取要下载的文件内容
        InputStream resourceAsStream = servletContext.getResourceAsStream("/file/downloadFile/" + downloadFileName);
        //6.通过response获取输出流
        OutputStream outputStream = response.getOutputStream();
        //7.org.apache.commons.io.IOUtils,将输入流中的数据读到response输出流中
        IOUtils.copy(resourceAsStream, outputStream);
    }
}
