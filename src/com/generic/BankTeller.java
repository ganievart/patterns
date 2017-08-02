package com.generic;

import org.springframework.cglib.core.DefaultGeneratorStrategy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by sbt-ganiev-ar on 29.05.2017.
 */

interface Generator<T> {
    T next();
}
class Customer {
    private static long counter = 1;
    private final long id = counter ++;
    private Customer() {}
    public String toString() {
        return "Customer " + id;
    }
    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            public Customer next(){return new Customer();}
        };
    }
}

class Teller {
    private static long counter =1;
    private final long id = counter ++;
    private Teller() {}
    public String toString() {return "Teller " + id;}
    public static Generator<Teller> generator = new Generator<Teller>() {
        public Teller next() {
            return new Teller();
        }
    };
}

public class BankTeller {
    public static void serve(Teller t, Customer c) {
        System.out.println(t + " serves " + c);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<Customer> line = new LinkedList<Customer>();
//        Genea
    }
}
