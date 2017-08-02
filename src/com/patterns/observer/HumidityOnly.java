package com.patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class HumidityOnly implements Observer, DisplayElement {

    private float hum;

    public HumidityOnly(Observable observer) {
        observer.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("HumidityOnly");

    }

    @Override
    public void update(Observable o, Object arg) {
        display();

    }
}
