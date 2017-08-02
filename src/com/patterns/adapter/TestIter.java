package com.patterns.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class TestIter {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));

        Iterator iterator = list.iterator();
        System.out.println(iterator.next());

        EnumerationIterator oldIterator = new EnumerationIterator(list.iterator());
        oldIterator.nextElement();







    }
}
