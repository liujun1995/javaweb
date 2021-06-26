package com.atguigu.servlet;

import com.atguigu.utils.Base64Utils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author LiuJun
 * @create 2021-06-18-19:59
 * @description
 */
public class LoginServlet extends BaseServlet {

    protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //验证用户名和密码是否正确，先写死
        if ("liujun".equals(username)&&"123456".equals(password)){
            //登陆成功
            Cookie cookie = new Cookie("username", Base64Utils.getBase64Code(username));
            //cookie存活一周
            cookie.setMaxAge(60*60*24*7);
            response.addCookie(cookie);
            request.setAttribute("username", username);
            request.getRequestDispatcher("/jsp/login_success.jsp").forward(request, response);
        }else {
            request.setAttribute("username", username);
            request.setAttribute("illegal", "illegal");
            request.getRequestDispatcher("/jsp/index.jsp").forward(request, response);
        }
    }
}
