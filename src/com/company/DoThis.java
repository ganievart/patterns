package com.company;

/**
 * Created by sbt-ganiev-ar on 16.05.2017.
 */
public class DoThis {
    void f() {
        System.out.println("DoThis f()");
    }
    protected class Inner {
        public DoThis outer() {
            return DoThis.this;
        }
    }
//    public Inner inner() {return new Inner();}

    public static void main(String[] args) {
        DoThis dt = new DoThis();
//        DoThis.Inner dti = dt.inner();
        DoThis.Inner p = dt.new Inner();

    }
}

class TestDoThis {

    public static void main(String[] args) {
        DoThis dt = new DoThis();
//        DoThis.Inner
    }

}

