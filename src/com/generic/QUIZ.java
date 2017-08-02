package com.generic;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by sbt-ganiev-ar on 29.05.2017.
 */
public class QUIZ {

    public void method(Object o) {
        System.out.println("object");
    }

    public void method(FileNotFoundException e) {
        System.out.println("exception");
    }

    public void method(IOException ex) {
        System.out.println("exception 2");
    }

    public static void main(String[] args) {
        QUIZ quiz = new QUIZ();
        quiz.method(null);
    }
}
