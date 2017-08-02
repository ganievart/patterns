package com.generic;

import java.rmi.activation.ActivationMonitor;

/**
 * Created by sbt-ganiev-ar on 29.05.2017.
 */

class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        first = a;
        second = b;
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
    public final C third;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        third = c;
    }

    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}

class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {
    public final D fourth;

    FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        this.fourth = d;
    }
}

class Amphibian {
};

class Vehicle {
};

public class Tuple {

    static TwoTuple<String, Integer> f() {
        return new TwoTuple<String, Integer>("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(), "hi", 47);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();

        TwoTuple<String, String> ttsi2 = new TwoTuple<String, String>("hello", "arthur");
        TwoTuple<Integer, Integer> ttsi3 = new TwoTuple<Integer, Integer>(1, 1);

        System.out.println(ttsi2);
        System.out.println(ttsi3);
    }
}






















