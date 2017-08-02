package com.patterns.factory;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStylePizzaCheese();
        }
        return null;
    }
}
