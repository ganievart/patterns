package com.company;

/**
 * Created by sbt-ganiev-ar on 16.05.2017.
 */


abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    public void cancel() {canceled = true;}
    public boolean isCanceled() {
        return canceled;
    }


}

public class MainChecker {
}
