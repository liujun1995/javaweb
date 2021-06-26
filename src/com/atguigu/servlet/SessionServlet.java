package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author LiuJun
 * @create 2021-06-19-7:28
 * @description
 */
public class SessionServlet extends BaseServlet{

    protected void createOrGetSession(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //创建或获取会话对象
        HttpSession session = request.getSession();
        //判断 当前session是否是新创建的
        boolean isNew = session.isNew();
        //获取session会话的唯一标识
        String id = session.getId();

        response.getWriter().write("得到的Session,id是："+id+"<br/>");
        response.getWriter().write("新创建的?"+isNew);
    }

    protected void getAttribute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object session1 = request.getSession().getAttribute("session1");
        response.getWriter().write("从session对象中获取出属性session1的值是："+session1);

    }

    protected void setAttribute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.getSession().setAttribute("session1", "sessionValue1");
    }

    protected void sessionLife(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int maxInactiveInterval = request.getSession().getMaxInactiveInterval();
        response.getWriter().write("session修改后的超时时常"+maxInactiveInterval+"秒");
    }

    protected void lifeSet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(3);
        response.getWriter().write("session3秒后超时！");
    }

    protected void deleteNow(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //使session对象马上失效
        session.invalidate();
    }
}
