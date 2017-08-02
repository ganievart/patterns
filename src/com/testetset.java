package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sbt-ganiev-ar on 28.06.2017.
 */
class SomeClass {



}

public class testetset {

    public List<Integer>  testChange(List<Integer> x) {
        x.add(10);
        return x;
    }

    private void tipaTest() {
        List<Integer> integers = new ArrayList<>();
        System.out.println(integers);

        testChange(integers);
        System.out.println(integers);


    }

    public static void main(String[] args) {

        testetset testetset = new testetset();
        testetset.tipaTest();

    }
}

