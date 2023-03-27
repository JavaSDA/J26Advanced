package com.company.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> ball = Class.forName("com.company.ball.Ball");
        Method[] ballMethods = ball.getMethods();
        Field[] fields = ball.getDeclaredFields();

//        for (Method method : ballMethods) {
//            System.out.println(method);
//        }

        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
