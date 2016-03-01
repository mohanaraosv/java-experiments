package com.sample;

import java.lang.reflect.*;

public class StringChars {

    public static void main(String... args) throws NoSuchFieldException, IllegalAccessException {
        Field value = String.class.getDeclaredField("value");
        value.setAccessible(true);
        String hello_world = "Hello world";
        String hello = hello_world.substring(0, 5);
        hello_world.length();
        System.out.println(hello_world.length());
        System.out.println(hello);
        System.out.println(value.get(hello_world));
        System.out.println(value.get(hello));
    }
}
