package Oops;
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Objects {
    public static void main(String[] args) {
        // Creating a Person object using the new keyword and constructor
        Person person1 = new Person("Alice", 30);

        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
    }
}