package com.atguigu.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author LiuJun
 * @create 2021-06-12-22:32
 * @description
 */
public class Person {
    private String name;
    private String[] phones;
    private List<String> cities;
    private Map<String,Object> mp;

    public Person() {
    }

    public Person(String name, String[] phones, List<String> cities, Map<String, Object> msp) {
        this.name = name;
        this.phones = phones;
        this.cities = cities;
        this.mp = msp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Map<String, Object> getMp() {
        return mp;
    }

    public void setMp(Map<String, Object> msp) {
        this.mp = msp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", phones=" + Arrays.toString(phones) +
                ", cities=" + cities +
                ", mp=" + mp +
                '}';
    }
}
