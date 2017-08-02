package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.*;

/**
 * Created by sbt-ganiev-ar on 17.05.2017.
 */
abstract class InGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    public void cancel() {canceled = true;}
    public boolean isCanceled() {return canceled;}

}

class MutexEvenGenerator extends IntGenerator {
    public int currentEvenValue = 0;
    private Lock lock = new ReentrantLock();
    public int next() {
            synchronized (this) {
                ++currentEvenValue;
                Thread.yield();
                ++currentEvenValue;
            }
            return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new MutexEvenGenerator());
    }
}

class EvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;
    public synchronized int next() {
        ++currentEvenValue;
        ++currentEvenValue;

        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}


class EvenChecker implements Runnable {
    private IntGenerator generator;
    private final int id;
    public EvenChecker(IntGenerator g, int ident){
        generator = g;
        id = ident;
    }
    public void run() {
        while (!generator.isCanceled()) {
            int val = generator.next();
//            System.out.println("val = " + val);
            if (val % 2 !=0) {
                System.out.println(val + " нечетно");
                generator.cancel();
            }
        }
    }
    public static void test(IntGenerator gp, int count) {
        System.out.println("ctrl + C to exit");
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < count; i++) {
            exec.execute(new EvenChecker(gp, i));
        }
        exec.shutdown();
    }
    public static void test(IntGenerator gp) {
        test(gp, 100);
    }
}



public class ThreadThdread {

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
