class Overloading {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {

        return a + b;

    }

    public static void main(String[] args) {

        Overloading calc = new Overloading();

        System.out.println(calc.add(5, 3)); //
        System.out.println(calc.add(2.5, 1.8)); //

    }

}
