public class StaticvsInstBlock {
    static {// static block
        System.out.println("I will execute only once a Class get Loaded");
    }
    {
        System.out.println("This block get execute  every time an Object of the Class is created");
    }

    public static void main(String[] args) {
        StaticvsInstBlock obj1 = new StaticvsInstBlock();
        StaticvsInstBlock obj2 = new StaticvsInstBlock();
    }
}
