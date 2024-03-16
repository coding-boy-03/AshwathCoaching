interface Ashwath {// interface class--No, you cannot directly create an object of an interface
                   // class in Java
    void coder();// u can't write body of this method(Can't write Implementation of this merthod)
}

class Abhi implements Ashwath {
    @Override
    public void coder() {// must be implemented in every child classed.
        System.out.println("I am coding brother of Ash");
    }
}

public class Interface {
    public static void main(String[] args) {
        Abhi a = new Abhi();
        a.coder(); // calling the method from object of class Abhi

    }
}
