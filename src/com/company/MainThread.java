package com.company;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by sbt-ganiev-ar on 16.05.2017.
 */
class LittOff implements Runnable {
    protected int countDown = 1;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LittOff!") + ") " + '\n';
    }

    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }
}

public class MainThread {

    static int taskCount = 0;


    public static void main(String args[]) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();

        Thread daemon = new Thread(new LittOff());
        daemon.setDaemon(true);
        daemon.start();

        System.out.println(daemon.isDaemon());
        Thread.sleep(1000);
    }
}
