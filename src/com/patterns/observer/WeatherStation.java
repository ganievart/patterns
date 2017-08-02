package com.patterns.observer;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionDisplay(weatherData);
        new TemperatureOnly(weatherData);
        new PressureOnly(weatherData);
        new HumidityOnly(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(0,0,0);
    }
}
