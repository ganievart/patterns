package com.patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class PressureOnly implements Observer, DisplayElement {

    private float pressure;

    public PressureOnly(Observable observer) {
        observer.addObserver(this);
    }

    @Override
    public void display() {

        System.out.println("PressureOnly: " + pressure);

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            this.pressure = ((WeatherData) o).getPressure();
            display();
        }

    }
}
