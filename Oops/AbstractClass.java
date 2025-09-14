package Oops;
abstract class Vehicle {
    abstract void start(); // only idea
    abstract void stop();
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike started with kick");
    }
    void stop() {
        System.out.println("Bike started with kick");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started with key");
    }
    void stop() {
        System.out.println("Bike started with kick");
    }
}

class AbstractClass {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        Vehicle v2 = new Car();
        v1.start();
        v2.start();
        v1.stop();
    }
}
