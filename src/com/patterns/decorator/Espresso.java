package com.patterns.decorator;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class Espresso implements Beverage {

    @Override
    public String getDesc() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
