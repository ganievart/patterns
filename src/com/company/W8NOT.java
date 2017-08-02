package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by sbt-ganiev-ar on 17.05.2017.
 */

class Car {
    private boolean waxOn = false;

    public synchronized void waxed() {
        waxOn = true;
        notifyAll();
    }

    public synchronized void buffed() {
        waxOn = false;
        notifyAll();
    }

    public synchronized void waitForWaxing() throws InterruptedException {
        while (!waxOn)
            wait();
    }

    public synchronized void waitForBuffing() throws InterruptedException {
        while (waxOn)
            wait();
    }
}

class WaxOn implements Runnable {
    private Car car;

    public WaxOn(Car c) {
        car = c;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println("WAX ON");
                TimeUnit.MILLISECONDS.sleep(200);
                car.waxed();
                car.waitForBuffing();
            }
        } catch (InterruptedException e) {
            System.out.println("EXIT VIA INTERRUPT");
        }
        System.out.println("END WAX OF TASK");
    }

}

class WaxOff implements Runnable {
    private Car car;

    public WaxOff(Car c) {
        car = c;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                car.waitForWaxing();
                System.out.println("WAX Off");
                TimeUnit.MILLISECONDS.sleep(200);
                car.buffed();

            }
        } catch (InterruptedException e) {
            System.out.println("EXIT VIA INTERRUPT");
        }
        System.out.println("END WAX OF TASK");
    }

}

public class W8NOT {

    public static void main(String[] args) throws InterruptedException {
        Car c = new Car();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new WaxOff(c));
        exec.execute(new WaxOn(c));
        TimeUnit.SECONDS.sleep(5);
        exec.shutdown();
    }
}
