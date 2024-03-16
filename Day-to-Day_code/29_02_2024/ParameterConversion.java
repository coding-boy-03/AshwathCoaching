public class ParameterConversion {
    int Sum(double a, int b) {
        return (int) (a + b);
    }

    double Sum(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        ParameterConversion obj = new ParameterConversion();
        System.out.println("Sum of Double and Integer : " + obj.Sum(5.6, 3));
        System.out.println("Sum of Integer and Double: " + obj.Sum(3, 7.8));
    }
}
