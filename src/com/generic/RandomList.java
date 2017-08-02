package com.generic;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by sbt-ganiev-ar on 29.05.2017.
 */
public class RandomList<T> {

    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);
    public void add(T item) {storage.add(item);}
    public T select() {
        return storage.get(rand.nextInt(storage.size()));}

    public static void main(String[] args) {
        RandomList<Boolean> rs = new RandomList<Boolean>();
        RandomList<String> rs2 = new RandomList<String>();

        for (String s : ("awd awd aawdaw awdawdawd   awd a wd aw d awd  wd awdawdawd").split(" ")) {
            rs2.add(s);
        }

        for (int i = 0; i < 20; i++) {
            rs.add((i % 2) == 0);
        }


        for (int i = 0; i < 11; i++) {
            System.out.println(rs2.select() + " ");
        }
    }
}
