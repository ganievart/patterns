package com.patterns.decorator;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class StarbuzzCoffe {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDesc() + " " + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);

        System.out.println(beverage2.getDesc() + " " + beverage2.cost());


        Beverage beverage1 = new Mocha(new Mocha(new HouseBlend()));
        System.out.println(beverage1.getDesc() + beverage2.cost());



    }
}
