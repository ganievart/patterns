package com.generic;

/**
 * Created by sbt-ganiev-ar on 29.05.2017.
 */


class BasicHolder<T> {
    T element;
    void set(T arg) {element = arg;}
    T get() {return element;}
    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}

class SubType extends BasicHolder<SubType> {

}
public class CRGWithBasicHolder {

    public static void main(String[] args) {
        SubType s1 = new SubType(), s2 = new SubType();
        s1.set(s2);
        SubType s3 = (SubType) s1.get();
        s1.f();
    }
}
