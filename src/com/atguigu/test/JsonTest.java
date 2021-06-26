package com.atguigu.test;

import com.atguigu.json.KidListType;
import com.atguigu.json.KidMapType;
import com.atguigu.pojo.Kid;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import jdk.nashorn.internal.parser.Token;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LiuJun
 * @create 2021-06-23-14:12
 * @description
 */
public class JsonTest {

    /**
     * javaBean和json的转换
     */
    @Test
    public void javaBeanAndJson(){
        Kid liuJun = new Kid("LiuJun", 18);
        Gson gson  = new Gson();
        //javaBean转换为json字符串
        String kidJsonString = gson.toJson(liuJun);
        System.out.println(kidJsonString);

        gson.fromJson(kidJsonString, Kid.class);

    }

    /**
     * json和List of Javabean的转换
     */
    @Test
    public void ListAndJson(){

        List<Kid> kidList = new ArrayList<>();
        kidList.add(new Kid("ZhangSan", 3));
        kidList.add(new Kid("LiSi", 4));
        Gson gson  = new Gson();
        //把list of kid转换为Json字符串
        String kidListToJsonString = gson.toJson(kidList);
        System.out.println(kidListToJsonString);//[{"name":"ZhangSan","age":3},{"name":"LiSi","age":4}]
        List<Kid> jsonStringToJavabeanList = gson.fromJson(kidListToJsonString, new KidListType().getType());
        /*System.out.println(jsonStringToJavabeanList);//[Kid{name='ZhangSan', id=3}, Kid{name='LiSi', id=4}]*/
        for (Kid k:jsonStringToJavabeanList){
            System.out.println(k.getClass());
        }

    }

    /**
     * Map<String,Kid>和json字符串的相互转化
     */
    @Test
    public void mapAndJson(){

        Map<String,Kid>  kidMap  = new LinkedHashMap<>(16);

        kidMap.put("ZhangSan", new Kid("ZhangSan", 3));
        kidMap.put("LiSi",new Kid("LiSi", 4));
        //将map转换为json字符串
        Gson gson = new Gson();
        String KidMapJsonString = gson.toJson(kidMap);
        System.out.println(KidMapJsonString);//{"ZhangSan":{"name":"ZhangSan","age":3},"LiSi":{"name":"LiSi","age":4}}
        //将json字符串转回为map
        Map<String,Kid> jsonStringToJavabeanMap = gson.fromJson(KidMapJsonString,
                (new TypeToken<Map<String,Kid>>(){}).getType());//匿名子类的匿名对象
        for (Map.Entry<String,Kid> entry : jsonStringToJavabeanMap.entrySet()){
            System.out.println(entry.getKey() +":"+ entry.getValue());
        }



    }


}
