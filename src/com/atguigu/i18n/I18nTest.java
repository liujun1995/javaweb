package com.atguigu.i18n;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author LiuJun
 * @create 2021-06-24-13:03
 * @description
 */
public class I18nTest {
    @Test
    public void testLocal(){
        //获取安装的操作系统语言版本
        Locale aDefault = Locale.getDefault();
        //System.out.println(aDefault);//zh_CN
        System.out.println(Locale.CHINA);
        System.out.println(Locale.US);
    }

    @Test
    public void testI18n(){

        Locale china = Locale.CHINA;//zh_CN
        //通过指定的basename和local对象，读取相应的配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("i18n", china);

        String username = bundle.getString("username");
        System.out.println(username);

    }
}
