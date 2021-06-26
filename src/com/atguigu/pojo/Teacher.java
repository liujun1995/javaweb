package com.atguigu.pojo;

import java.util.Objects;

/**
 * @author LiuJun
 * @create 2021-06-13-18:58
 * @description
 */
public class Teacher {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String phone;

    public Teacher() {

    }

    public Teacher(Integer id, String username, String password, Integer age, String phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(id, teacher.id) &&
                Objects.equals(username, teacher.username) &&
                Objects.equals(password, teacher.password) &&
                Objects.equals(age, teacher.age) &&
                Objects.equals(phone, teacher.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, age, phone);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
