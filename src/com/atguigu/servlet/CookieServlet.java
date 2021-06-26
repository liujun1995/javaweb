package com.atguigu.servlet;

import com.atguigu.utils.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author LiuJun
 * @create 2021-06-18-10:52
 * @description
 */

public class CookieServlet extends BaseServlet {

    protected void createCookie(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建cookie对象
        Cookie cookie = new Cookie("key1", "value1");
        //通过客户端保存cookie
        response.addCookie(cookie);
        response.getWriter().write("Cookie创建成功！");
    }

    protected void getCookie(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();

        Cookie wantCookie = CookieUtils.findCookie("key1", cookies);

        if (wantCookie != null) {

            response.getWriter().write("Find!");
        }
    }

    protected void updateCookie(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //第一种方式，创建与原cookie同名的新cookie,传给客户端
        /*Cookie cookie = new Cookie("key1", "newValue");

        response.addCookie(cookie);

        response.getWriter().write("update!");*/

        //第二种方式，查找到需要修改的Cookie对象，调用setValue方法赋予新的cookie值
        //调用response.addCookie方法
        Cookie cookie = CookieUtils.findCookie("key1", request.getCookies());

        if (cookie!=null){
            cookie.setValue("newValue1");
            response.addCookie(cookie);
        }

    }


    protected void life(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = CookieUtils.findCookie("key1", request.getCookies());
        if (cookie!=null&&cookie.getMaxAge()<0){
            cookie.setValue("newValue1");
            cookie.setMaxAge(60);
            response.addCookie(cookie);
            response.getWriter().write("cookie存活时间改变");
        }

    }

    protected void path(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie cookie = new Cookie("path1", "path1");

        cookie.setPath(request.getContextPath()+"/abc");
        response.addCookie(cookie);
        response.getWriter().write("创建路径为"+request.getContextPath()+"/abc"+"的cookie");
    }
}
