package com.atguigu.utils;

import javax.servlet.http.Cookie;

/**
 * @author LiuJun
 * @create 2021-06-18-14:14
 * @description
 */
public class CookieUtils {
    /**
     *
     * @param name 查找指定名称的cookie对象
     * @param cookies
     * @return
     */
    public static Cookie findCookie(String name,Cookie[] cookies){
        if (name==null||cookies==null||cookies.length==0){
            return null;
        }
        for (Cookie cookie : cookies) {
            if (name.equals(cookie.getName())){
                return cookie;
            }
        }
        return null;
    }
}
