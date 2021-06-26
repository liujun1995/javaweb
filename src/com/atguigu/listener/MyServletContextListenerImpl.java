package com.atguigu.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author LiuJun
 * @create 2021-06-12-21:16
 * @description
 */
public class MyServletContextListenerImpl implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext对象被创建了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext对象被销毁了");
    }
}
