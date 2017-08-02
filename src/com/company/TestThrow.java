package com.company;

/**
 * Created by sbt-ganiev-ar on 25.05.2017.
 */
public class TestThrow {





    public static void main(String[] args) throws Exception {

        try {
            System.out.println("Hello 1");
            throw new Exception();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            System.out.println("finally");
        }

    }
}
