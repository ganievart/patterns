package com.company;


interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementational implements Service {

    Implementational() {};
    public void method1() {
        System.out.println("impl method1");
    }

    public void method2() {
        System.out.println("impl method2");
    }
}

class Implementational1Factory implements ServiceFactory {

    public Service getService() {
        return new Implementational();
    }
}

class Implementational2 implements Service {

    Implementational2() {};
    public void method1() {
        System.out.println("impl2 method1");
    }

    public void method2() {
        System.out.println("impl2 method2");
    }
}

class Implementational2Factory implements ServiceFactory {

    public Service getService() {
        return new Implementational2();
    }
}

public class Main {

    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementational1Factory());
        serviceConsumer(new Implementational2Factory());
    }
}
