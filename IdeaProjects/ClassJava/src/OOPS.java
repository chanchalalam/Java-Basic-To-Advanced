//class Pen{
//    String color;
//    String type;
//
//    public void write(){
//        System.out.println("writing something");
//    }
//
//}
//public class OOPS {
//    public static void main(String[] args) {
//        Pen pen1 =new Pen();
//        pen1.color = "blue";
//        pen1.type= "gel";
//
//        pen1.write();
//    }
//}

//class Pen {
//    String color;
//
//    public void printColor() {
//        System.out.println("The color of this Pen is " + this.color);
//    }
//}


//public class OOPS {
//    public static void main(String args[]) {
//        Pen p1 = new Pen();
//        p1.color = blue;
//
//
//        Pen p2 = new Pen();
//        p2.color = black;
//
//
//        Pen p3 = new Pen();
//        p3.color = red;
//
//
//        p1.printColor();
//        p2.printColor();
//        p3.printColor();
//    }


//class Student {
//    String name;
//    int age;
//
//    public void getInfo() {
//        System.out.println("The name of this Student is " + this.name);
//        System.out.println("The age of this Student is " + this.age);
//    }
//
//    // Default constructor
//    Student() {
//        System.out.println("Constructor called");
//    }
//
//    // Parameterized constructor
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    // Copy constructor (corrected)
//    Student(Student s2) { // Use "Student s2" as the argument type
//        this.name = s2.name;
//        this.age = s2.age;
//    }
//}
//
//public class OOPS {
//    public static void main(String args[]) {
//        Student s1 = new Student("Kartik", 20);  // Use parameterized constructor
//        s1.getInfo();
//
//        Student s2 = new Student(s1);  // Use copy constructor
//        s2.getInfo();
//    }
//}

//class Student {
//    private String name;  // Encapsulate name and age
//    private int age;
//
//    public Student(String name, int age) {  // Constructor to initialize fields
//        this.name = name;
//        this.age = age;
//    }
//
//    public void displayInfo() {  // Single method to display all information
//        System.out.println("Name: " + this.name);
//        System.out.println("Age: " + this.age);
//    }
//
//    // Getters for name and age (if needed)
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}
//class Shape {
//    public void area() {
//        System.out.println("Displays Area of Shape");
//    }
//}
//class Triangle extends Shape {
//    public void area(int h, int b) {
//        System.out.println((1/2)*b*h);
//    }
//}
//class Circle extends Shape {
//    public void area(int r) {
//        System.out.println((3.14)*r*r);
//    }
//}

//1. Single inheritance : When one class inherits another class, it is known as single level inheritance
//class Shape {
//    public void area() {
//        System.out.println("Displays Area of Shape");
//    }
//}
//class Triangle extends Shape {
//    public void area(int h, int b) {
//        System.out.println((1/2)*b*h);
//    }
//}

//Hierarchical inheritance : Hierarchical inheritance is defined as the process of deriving more than one class from a base class.
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
    }
}
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}
//class Shape {
//    public void area() {
//        System.out.println("Displays Area of Shape");
//    }
//}
//class Triangle extends Shape {
//    public void area(int h, int b) {
//        System.out.println((1/2)*b*h);
//    }
//}
//class EquilateralTriangle extends Triangle {
//    int side;
//}

// Abstract class defining common animal behaviors
abstract class Animal {
    // Abstract method to be implemented by subclasses
    abstract void walk();

    // Concrete method shared by all animals
    void breathe() {
        System.out.println("This animal breathes air");
    }

    // Constructor for Animal objects
    Animal() {
        System.out.println("You are about to create an Animal.");
    }
}

//interface
//interface Animal {
//    void walk();
//}

// Horse class extending Animal, providing specific implementations
class Horse extends Animal {
    // Constructor for Horse objects
    Horse() {
        System.out.println("Wow, you have created a Horse!");
    }

    // Implementation of walk() for Horse
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

// Chicken class extending Animal, providing specific implementations
class Chicken extends Animal {
    // Constructor for Chicken objects
    Chicken() {
        System.out.println("Wow, you have created a Chicken!");
    }

    // Implementation of walk() for Chicken
    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

// Main class to demonstrate polymorphism
public class OOPS {
    public static void main(String args[]) {
        // Create a Horse object
        Horse horse = new Horse();

        // Call methods on the Horse object
        horse.walk();  // Output: Horse walks on 4 legs
        horse.breathe(); // Output: This animal breathes air
    }
}

//class Student {
//    static String school;
//    String name;
//}
//
//
//public class OOPS {
//    public static void main(String args[]) {
//        Student.school = "JMV";
//        Student s1 = new Student();
//        Student s2 = new Student();
//
//
//        s1.name = "Meena";
//        s2.name = "Beena";
//
//
//        System.out.println(s1.school);
//        System.out.println(s2.school);
//    }
//}
//
