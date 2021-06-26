package com.atguigu.threadlocal;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author LiuJun
 * @create 2021-06-22-14:07
 * @description
 */
public class ThreadLocalTest {

    public static final Map<String, Object> data = new ConcurrentHashMap<>(16);
    private static Random random = new Random();


    public static class Task implements Runnable {

        @Override
        public void run() {
            //随机生成线程要关联的数据，以当前线程名作为KEY保存到MAP中
            int i = random.nextInt(1000);//0-999的一个随机数
            Thread.currentThread().setName("线程" + i);
            System.out.println("线程[" + Thread.currentThread().getName() + "]生成的随机数是：" + i);
            data.put(Thread.currentThread().getName(), i);
            Object o = data.get(Thread.currentThread().getName());
            System.out.println("当前线程"+Thread.currentThread().getName()+"关联的数据是：" + o);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new Task()).start();
        }
    }
}
