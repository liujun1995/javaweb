package com.atguigu.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author LiuJun
 * @create 2021-06-21-21:51
 * @description
 */
public class AdminFilter implements Filter {


    public AdminFilter() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * 用于拦截请求，做权限检查
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        Object user = httpServletRequest.getSession().getAttribute("user");
        //如果等于null,说明没有登陆
        if (user==null){
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }else {
            //让程序继续访问目标资源
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
