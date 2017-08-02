package com.patterns.decorator;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class Mocha implements Beverage {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDesc() {
        return beverage.getDesc() + " mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
