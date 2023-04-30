package com.java8.lambdas.tests.morganstanley30apr23;

public class MorganStanleyTest1 {
    static void printValue(Animal a) {
        System.out.println("ONE");
    }
    static void printValue(Dog d) {
        System.out.println("Two");
    }
    static void printValue(Object a) {
        System.out.println("THREE");
    }

    public static void main(String[] args) {
        Labrador l = new Labrador();
        printValue(l);
    }
}



class Animal {

}

class Dog extends Animal {

}

class Labrador extends Dog {

}
