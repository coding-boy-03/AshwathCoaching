class Singleton {

    int a;
    private static Singleton flag;// to make we only create Only One Obj of this Class.--global static variable
    // flag is the single of Type Singleton
    // flag is static because Only we can use a static variable inside a static
    // method

    private Singleton(int a) {// you can't access constructor Outside this Class so Private
        this.a = a;
        System.out.println("hi Abhi");
    }

    public static Singleton Singletonaccess() {// static method of type Singleton-- to return Obj of Type Singleton
        // i need this because i want to create Object using Static Method;
        if (flag == null) {
            flag = new Singleton(10);
            return flag;
        }

        return flag;
    }
}

/**
 * InnerMain
 */

public class SingletonMain {
    public static void main(String[] args) {
        Singleton s = Singleton.Singletonaccess();
        Singleton m = Singleton.Singletonaccess();
        System.out.println("val " + s.a + " " + m.a); //
        s.a = 5;// here i have modified the "s" obj but the value of "m" obj also changed
        // Bec "s"&"m" both are reffering to same object -(flag) so when we modify one
        // it reflects on other too
        System.out.println("val " + s.a + " " + m.a);//

    }
}