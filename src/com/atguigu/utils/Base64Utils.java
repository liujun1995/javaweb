package com.atguigu.utils;

import sun.misc.BASE64Encoder;
import java.nio.charset.StandardCharsets;

/**
 * @author LiuJun
 * @create 2021-06-18-20:45
 * @description
 */
public class Base64Utils {

    public static String getBase64Code(String str) {
        if (str != null && !"".equals(str)) {
            BASE64Encoder base64Encoder = new BASE64Encoder();
            return base64Encoder.encode(str.getBytes(StandardCharsets.UTF_8));
        }
        return null;
    }
}
