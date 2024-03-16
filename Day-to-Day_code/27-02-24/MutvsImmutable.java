/*
 * "this keyword"
 * Mutable(non Primitive) vs Immutable ( primitive)
 * 
 */
/**
 * MyObject
 */
class MyObject {

    int a;

    public MyObject(int a) {
        this.a = a; // using 'this' to refer the field of current class
    }

    public void Set(int x) {
        this.a = x; // same as above, just for differentiation
    }

    public int Get() {
        return a;
    }
}

public class MutvsImmutable {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Hash code of x: " + System.identityHashCode(x));
        x = 5;
        System.out.println("Hash code of x: " + System.identityHashCode(x));
        /*
         * Primitive types are Immutable (you cant
         * modfiy the adrress of "x")
         */
        // Mutable type example
        MyObject obj = new MyObject(10);
        System.out.println("\n\n-------------------------");
        System.out.println("Before modification : ");
        System.out.println("Value of a in object : " + obj.Get());
        System.out.println("Address of a in object : " + System.identityHashCode(obj));
        obj.Set(20);
        System.out.println("After modification : ");
        System.out.println("Value of a in object : " + obj.Get());
        System.out.println("Address of a in object : " + System.identityHashCode(obj));
    }
}
