package com.patterns.decorator;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class HouseBlend implements Beverage {


    @Override
    public String getDesc() {
        return "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
