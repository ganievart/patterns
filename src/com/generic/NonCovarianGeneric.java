package com.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sbt-ganiev-ar on 29.05.2017.
 */

class Friut {};
class Apple extends Friut {};
class Johnatan extends Apple{};
class Orange extends Friut{};

public class NonCovarianGeneric {
    public static void main(String[] args) {
        List<? super Apple> flist = new ArrayList<Apple>();
        flist.add(new Johnatan());

    }
}
