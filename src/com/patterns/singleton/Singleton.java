package com.patterns.singleton;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }


}
