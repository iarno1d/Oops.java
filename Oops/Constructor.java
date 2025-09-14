package Oops;
class Student {
    String name;
    Student(String n) {
        name = n;
        System.out.println("Student created: " + name);
    }
}

class Constructor {
    public static void main(String[] args) {
        Student s = new Student("Rahul");
    }
}
