package com.patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class TemperatureOnly implements Observer, DisplayElement{

    private float temperature;


    public TemperatureOnly(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temperature ONLY: " + temperature);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            this.temperature = ((WeatherData) o).getTemperature();
            display();
        }
    }
}
