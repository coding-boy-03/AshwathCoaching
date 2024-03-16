class A {/*
          * calling a different constructors within a same class ,, the name of the
          * constructor remain same
          */
    /*
     * basicalling i have created a 3 different constructor of same class has a 3
     * different objects.
     * //
     * this keyword is used to call a constructor2 within constructor1
     */
    public int x, y, z;

    public A(int x, int y, int z) {// construcot1
        this(x, y);// call the constructor2 first then only you can write the implementation
                   // constructor01
        this.z = z;
        System.out.println("this constructor has value z only" + z);

    }

    public A(int x, int y) {// constructor2
        this(x);
        this.y = y;
        System.out.println("this constructor has value z only" + y);
    }

    public A(int x) {// construcutor 3
        this.x = x;
        System.out.println("this constructor has value x  only" + x);
    }
}

public class ConstructorChainig {
    // Constructors can be chained together using this keyword.
    // ThisKeyword is used to refer to the instance that is being created by a
    // constructor.
    public static void main(String[] args) {
        new A(10, 20, 30);
    }
}
