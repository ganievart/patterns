package com.patterns.factory;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class Test {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChicagoStylePizzaStore();
        pizzaStore.orderPizza("cheese");

        PizzaStore pizzaStore2 = new NYStylePizzaStore();
        pizzaStore2.orderPizza("cheese");



    }
}
