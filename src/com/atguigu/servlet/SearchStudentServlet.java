package com.atguigu.servlet;

import com.atguigu.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LiuJun
 * @create 2021-06-12-19:51
 * @description
 */
public class SearchStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取请求的参数

        //发sql语句查询学生的信息

        //保存查询到的结果到request域中
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            students.add(new Student(i, "name" + i, 18 + i, "phone" + i));
        }
        req.setAttribute("stuList", students);

        //请求转发到showStudent.jsp中
        req.getRequestDispatcher("/jsp/showStudent.jsp").forward(req, resp);

    }

}
