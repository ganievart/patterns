package com.company;

/**
 * Created by sbt-ganiev-ar on 16.05.2017.
 */
class Sleeper extends Thread {
    private int duration;
    public Sleeper(String name, int sleeptime) {
        super(name);
        duration = sleeptime;
        start();
    }
    public void run() {
        try {
            sleep(duration);
        }catch (InterruptedException e) {
            System.out.println(getName() + " itterupted " + isInterrupted());
            return;
        }
        System.out.println(getName() + " activizirovalsya");
    }
}

class Joiner extends Thread {
    private Sleeper sleeper;
    public Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }
    public void run() {
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            System.out.println("itterupted");
        }
        System.out.println(getName() + " join end ");
    }
}

public class Joining  {
    public static void main(String[] args) {
//        Sleeper sleepy = new Sleeper("Sleepy", 1500);
        Sleeper grumpy = new Sleeper("Grumpy", 1500);
//        Joiner dopey = new Joiner("Dopey", sleepy);
        Joiner doc = new Joiner("Doc", grumpy);

//        grumpy.interrupt();

    }

}
