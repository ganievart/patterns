package com.patterns.factory;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class ChicagoStylePizzaCheese implements Pizza {

    public void prepare() {
        System.out.println("prepare ChicagoStylePizzaCheese");
    }

    public void box() {
        System.out.println("box ChicagoStylePizzaCheese");
    }
}
