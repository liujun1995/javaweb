package com.atguigu.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @author LiuJun
 * @create 2021-06-13-21:57
 * @description
 */
public class UploadServlet extends HttpServlet {
    /**
     * 用于处理上传的数据
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决乱码，很重要
        request.setCharacterEncoding("utf-8");
        ServletInputStream inputStream = request.getInputStream();
        //字节缓冲区
        /*byte[] buffer = new byte[10240000];
        int readLength = inputStream.read(buffer);
        String s = new String(buffer, 0, readLength, StandardCharsets.UTF_8);
        System.out.println(s);*/
        //判断上传的数据是否是多段
        if (ServletFileUpload.isMultipartContent(request)){
            //FileItemFactory用于解析request对象，将每一段数据即每一个表单项封装为一个item
            FileItemFactory fileItemFactory = new DiskFileItemFactory();
            ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
            //解决乱码
           /* servletFileUpload.setHeaderEncoding("utf-8");*/
            try {
                //解析上传的数据，得到每一个表单项fileItem
                List<FileItem> list = servletFileUpload.parseRequest(request);
                //循环判断每一个表单项，是普通类型，还是上传的文件
                for (FileItem item:list) {
                    if (item.isFormField()){
                        //普通表单项
                        System.out.println("普通表单项的name属性值："+item.getFieldName());
                        //如果是中文，需要编码方式为utf-8，很重要
                        System.out.println("普通表单项的value属性值："+item.getString("utf-8"));
                    }else {
                        //上传的文件
                        System.out.println("文件的name属性值："+item.getFieldName());
                        System.out.println("文件名："+item.getName());
                        try {
                            item.write(new File("D:\\javaweb_projects\\dynamic\\" +
                                    "javaweb\\web\\file\\uploadFile\\"+item.getName()));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (FileUploadException e) {
                e.printStackTrace();
            }

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
