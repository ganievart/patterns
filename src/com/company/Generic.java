package com.company;

import javax.annotation.Generated;

/**
 * Created by sbt-ganiev-ar on 16.05.2017.
 */
class GenericImpl<T> {
    private T a;
    public GenericImpl(T a) {
        this.a = a;
    }
    public void set(T a) {
        this.a = a;
    }
    public T get() {
        return a;
    }
}

public class Generic {
    public static void main(String[] args) {
//        GenericImpl<String> stringGeneric = new GenericImpl<>("test");
//        stringGeneric.get();
//        stringGeneric.set("asdasd");


    }
}