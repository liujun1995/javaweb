package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

/**
 * @author LiuJun
 * @create 2021-06-19-22:09
 * @description
 */
public class RegistServlet extends BaseServlet {

    protected void regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取session中的验证码
        String token = (String) request.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        //马上删除session中的验证码属性
        request.getSession().removeAttribute(KAPTCHA_SESSION_KEY);
        String code = request.getParameter("code");
        //注意忽略code的大小写
        if (token!=null&&token.equalsIgnoreCase(code)){
            String username = request.getParameter("username");
            System.out.println(username + "保存到数据库");
            request.getSession().setAttribute("username", username);
            response.sendRedirect(request.getContextPath()+"/jsp/regist_success.jsp");
        }else{
            System.out.println("请不要重复提交表单！");
        }

        





    }
}
