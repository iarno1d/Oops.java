package Oops;
class Parent {
    String name = "Parent";
    void show() {
        System.out.println(this.name);  // Child
    }
}

class Child extends Parent {
    String name = "Child";
    void Cshow() {
        System.out.println(this.name);  // Child
        System.out.println(super.name); // Parent
    }
}

class CChild extends Child {
    String name = "CChild";
    void CCshow() {
        System.out.println(this.name);  // Child
        System.out.println(super.name); // Parent
    }
}

class ThisSuper {
    public static void main(String[] args) {
        CChild c = new CChild();
        c.show();
        c.Cshow();
        c.CCshow();
    }
}
