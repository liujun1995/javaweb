package com.atguigu.servlet;

import com.atguigu.pojo.Kid;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author LiuJun
 * @create 2021-06-23-21:27
 * @description
 */
public class AjaxServlet extends BaseServlet{

    protected void javaScriptAjax(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ajax请求！");
        Kid ZhangSan = new Kid("ZhangSan", 2);
        Gson gson = new Gson();
        String zhangSanJson = gson.toJson(ZhangSan);
        response.getWriter().write(zhangSanJson);
    }

    protected void getAjax(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ajax请求！");
        Kid ZhangSan = new Kid("ZhangSan", 2);
        Gson gson = new Gson();
        String zhangSanJson = gson.toJson(ZhangSan);
        response.getWriter().write(zhangSanJson);
    }

    protected void postAjax(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ajax请求！");
        Kid ZhangSan = new Kid("ZhangSan", 2);
        Gson gson = new Gson();
        String zhangSanJson = gson.toJson(ZhangSan);
        response.getWriter().write(zhangSanJson);
    }

    protected void getJsonAjax(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ajax请求！");
        Kid ZhangSan = new Kid("ZhangSan", 2);
        Gson gson = new Gson();
        String zhangSanJson = gson.toJson(ZhangSan);
        response.getWriter().write(zhangSanJson);
    }

    protected void serializeAjax(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameter("username"));
        Kid ZhangSan = new Kid("ZhangSan", 2);
        Gson gson = new Gson();
        String zhangSanJson = gson.toJson(ZhangSan);
        response.getWriter().write(zhangSanJson);
    }

}
