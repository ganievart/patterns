package com.patterns.factory;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
