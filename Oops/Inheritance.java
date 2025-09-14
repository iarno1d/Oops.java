package Oops;
class Animal {
    void eat(int a) { System.out.println("Eating..."); }
}

class Dog extends Animal {
    void eat() { System.out.println("Dog Eating..."); }
    void bark() { System.out.println("Barking..."); }
}

class Lion extends Dog {
    void eat() { System.out.println("Lion Eating..."); }
    void roar() { System.out.println("Roaring..."); }
}

class Inheritance {
    public static void main(String[] args) {
        Lion d = new Lion();
        Dog l =new Dog();
        l.eat();
        d.eat(1);  // inherited
        d.bark(); // own method
        d.roar();
        d.eat();
    }
}
