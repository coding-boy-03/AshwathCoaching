/**
 * AnonymousInnerClass
 */
/*
 * To create a Illusion of Obj of Interface we use Anonymous inner Class
 * To create a Illusion of Obj of Abstract we use Anonymous inner Class
 */
abstract class Car {
    void display() {
        System.err.println("Car is moving");//
    }
}

interface Ashwath {
    void coder();
}

public class AnonymousInnerClass {

    public static void main(String[] args) {
        Car c = new Car() {// c is actually an Object of the anonymous Inner Class
        };// AnonymousInnerClass
        c.display();
        Ashwath a = new Ashwath() {// using this i can crete a obj, implement method inside a interface
            @Override
            public void coder() {
                System.out.println("I'm abhi Ashwath bro ,Coding in Java");
            }

        };
        // Now calling the method using the object of interface
        a.coder();

    }
}