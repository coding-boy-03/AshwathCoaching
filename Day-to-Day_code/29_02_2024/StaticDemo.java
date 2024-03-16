/**
 * StaticDemo
 */
/**
 * Emp
 */
/*
 * Static variables are same for all the Objects
 * Non-Static variables are Different for all the Objects
 * Cann't use non-static variable in static block
 */
class Emp {
    int id;
    int sal;
    int a;
    static String ceo;// staic Variable -- it is not Obj specific . It belongs to class rather than
                      // object
    static {// static block is executed when the class is loaded into memory.
        ceo = "Abhi";

        System.out.println("this block is executed only once  when the class is loaded");
    }

    public Emp(int id, int sal) {// default constructor
        this.id = id;
        this.sal = sal;
    }

    public void display() {
        System.out.println("Id : " + this.id + " Salary :" + this.sal + " CEO : " + Emp.ceo);

    }

    static void comp() {// static method can be called without creating object of that class.
        System.out.println("Compny Name: " + "TCS");

    }
}

public class StaticDemo {
    static void StaticDemo_class() {
        System.out.println("This static method is belongs to 'StaticDemo' Class.");

    }

    public static void main(String[] args) {
        Emp e1 = new Emp(101, 5000);
        Emp e2 = new Emp(102, 7000);
        System.out.println(Emp.ceo); // calling a static variable using ClassName.staticVariable
        Emp.comp(); // calling a static method of class Emp without creating a obj of that class
        StaticDemo_class(); // calling a static method of class StaticDemo_class without creating a obj of
                            // that class
        e1.display();
        e2.display();

    }
}