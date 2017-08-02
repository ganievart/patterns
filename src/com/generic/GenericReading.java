package com.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sbt-ganiev-ar on 29.05.2017.
 */

public class GenericReading {
    static <T> T readExact(List<T> list) {
        return list.get(0);
    }
    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Friut> fruit = Arrays.asList(new Friut());
    static void f1() {
        Apple a = readExact(apples);
        Friut f = readExact(fruit);
        f = readExact(apples);
    }
    static class Reader<T> {
        T readExact(List<T> list) {return list.get(0);}
    }
    static void f2() {
        Reader<Friut> fruitReader = new Reader<Friut>();
        Friut f = fruitReader.readExact(fruit);
//        Friut a = fruitReader.readExact(apples);
    }
    static class CovariantReader<T> {
        T readCovariant(List<? extends T> list) {
            return  list.get(0);
        }
    }
    static void f3() {
        CovariantReader<Friut> fruitReade = new CovariantReader<Friut>();
        Friut f = fruitReade.readCovariant(fruit);
        Friut a = fruitReade.readCovariant(apples);
    }
}
