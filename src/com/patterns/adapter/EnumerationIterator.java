package com.patterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class EnumerationIterator implements Enumeration {

    Iterator iterator;

    public EnumerationIterator(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        System.out.println("hasMoreElements");
        return true;
    }

    @Override
    public Object nextElement() {
        System.out.println("nextElement");
        return null;
    }
}
