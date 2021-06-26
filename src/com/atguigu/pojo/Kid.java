package com.atguigu.pojo;

/**
 * @author LiuJun
 * @create 2021-06-23-14:13
 * @description
 */
public class Kid {

    private String name;
    private Integer age;

    public Kid() {
    }

    public Kid(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age= age;
    }

    @Override
    public String toString() {
        return "Kid{" +
                "name='" + name + '\'' +
                ", id=" + age +
                '}';
    }
}
