package com.company;


import org.springframework.util.StringUtils;

/**
 * Created by sbt-ganiev-ar on 19.05.2017.
 */
public class TestMain {

    public static void main(String[] args) {
        String s = null;
        System.out.println(isEmpty(s));
    }
    public static boolean isEmpty(String str)
    {
        return StringUtils.isEmpty(str)|| StringUtils.isEmpty(str.trim());
    }

}


