/**
 * Overridding
 */
class Abhi {
    public void method() {
        System.out.println("hi");

    }

}

class Ash extends Abhi {
    @Override
    public void method() {
        System.out.println("This");
    }
}

public class Overriding {

    public static void main(String[] args) {

        Ash sub = new Ash();
        sub.method(); // calling the subclass's version of method
        Abhi a = new Abhi();
        a.method(); // calling the superclass's version of method

    }
}