package com.java8;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public interface AnotherInterface {

    int x = 10;

    default void print() {
        System.out.println("bar");
    }
}
