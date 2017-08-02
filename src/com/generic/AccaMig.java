package com.generic;

/**
 * Created by sbt-ganiev-ar on 29.05.2017.
 */


class SuperMappedClass{};
class A extends SuperMappedClass{};
class B extends SuperMappedClass{}

public class AccaMig {


    public Class<? extends SuperMappedClass> get(int x) {
        return (x != 0) ? A.class : B.class;
    }

    public static void main(String[] args) {

    }
}
