
/**
 * Car
 */
/*
 * there is difference B/w Abstract class and abstract method
 */
abstract class Car {
    abstract void AbstrctDisplay();// Can't create the Body of the Method,must be implemented in Subclass

    public void display() {
        System.err.println("I'm a Car");// it has a Body , if user need -- it can be override
    }

}

class Benz extends Car {
    @Override
    // Implementing the Abstract Method
    void AbstrctDisplay() {
        System.out.println("Benz is coming");
    }

}

class Tata extends Car {
    @Override
    void AbstrctDisplay() {
        System.out.println("Tata is coming");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car b = new Benz();// outside World think it is Obj of Car BUT it is a Obj of Benz
        // so here you are hiding the Concept of Benz from outside world Completely --
        // Abstraction
        b.AbstrctDisplay();// calling the Method which is Implemented in Benz Class
        Car t = new Tata();
        t.AbstrctDisplay();//
        Car  c = new
    }
}
